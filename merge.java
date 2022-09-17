public class merge {
    public static void main(String[] args) {
        int a[]={0,1,0,3,0,5,0,8,15};
        int b[]={2,4,6,7};
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                for(int j=0;j<b.length;j++){
                    if(a[i+1]>b[j]){
                        a[i]=b[j];
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
