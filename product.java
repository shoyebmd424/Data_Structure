public class product{
    public static void main(String[] args) {
        int a[]={1,23,5,6,8,5,8,5};
        int i,j=0, p=1;
        int start=0,end=0;
        for(i=0;i<a.length-1;i++){
            for( j=i+1;j<a.length;j++){
            if(p<a[i]*a[j]){
                p=a[i]*a[j];
            start=a[i];
            end=a[j];

            }
        }
        }
        System.out.println(start+" "+end);
        System.out.println(p);
    }
}