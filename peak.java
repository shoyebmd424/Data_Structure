public class peak {
    public static void main(String[] args){
       int a[] ={1,2,3,4,5,6};
       int l=a.length;
       test obj=new test();
//  int result=obj.peak(a, l);
//  System.out.println("The peak value of an array series "+result);
//    obj.sorting(a, l);
int b[]=obj.reverse(a, l);
 for(int i=0;i<a.length;i++){
     System.out.println(b[i]);
 }
    }
}
class test{
    // public int peak(int a[] ,int n)
    // {
    //     int temp=0;       
    //     for(int i=1;i<a.length-2;i++)
    //     {
            
    //         if(a[i]<a[i+1]&& a[i+1]>a[i+2] )
    //         {
    //             if(a[a.length-1]>a[a.length-2])
    //             {
    //                 temp=a[a.length-1];
    //             }
    //             else{
    //             temp=a[i+1];
    //             }
    //         }
    //       //   System.out.println(temp);
    //     }
    //     return temp;
    // }
    public int[] reverse(int a[] , int n){
        for(int i=0;i<n;i++){
            a[i]=a[n-1];
            --n;
        }
        
            return a;
        
    }
}


