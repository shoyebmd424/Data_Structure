public class demo{
    public static void main(String[] args) {
        // int a[]={-2 ,1 ,-3, 4 ,-1, 2, 1, -5, 4};
        // int sum=0,max=0;
        // int l=a.length;
        // for(int i=0;i<a.length;i++){
        //     sum=sum+a[i];
        //     max=Math.max(sum, max);
        //     // if(sum<0){
        //     //     if(max>sum)
        //     //     max=sum;
        //     // }
        //     if(sum<0){
        //         max=sum;
        //     }
        // }
      
        // System.out.println(max);
       int a[] ={1,2,3,4,6,7};
       for(int i=1;i<a.length;i++){
           for(int j=i;j<a.length;j++){
               System.out.print(" "+a[j]);
           }
       }
    }
}