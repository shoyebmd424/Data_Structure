public class marge {
    public static void main(String[] args) {
        int a[]={1,4,6,7,8};
        int b[] ={2,3,9};
        int i, temp=0;
        for(i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]>b[j]){
                    temp=b[j];
                    b[j]=a[i];
                    a[i]=temp;
                }              
            }
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter");
        for(i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    
}
