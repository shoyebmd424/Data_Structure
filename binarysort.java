public class binarysort {
    public static void main(String[] args) {
        int a[] = { 1, 1, 0, 1, 0, 1, 0 };
        int n = a.length;
        int temp = 0;
        int i = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == 0)
                temp++;
        }
        int k=temp;
   while(temp>0){
    //    System.out.println(temp);
    --temp;
       a[temp]=0;
   }
   while(k<n-1){
       ++k;
       a[k]=1;
   }
   System.out.print("sorted array : [");
   for( i=0;i<n;i++){
       System.out.print(a[i]+",");
   }
   System.out.print("]");
       
    }
}
