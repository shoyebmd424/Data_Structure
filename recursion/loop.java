package recursion;
public class loop {
  static void   forloop(int n){
      if(n==0){
          return;
      }
   
            System.out.println(n);
            forloop(n-1);
    }
 static float sum(int n){
     if(n==0){
         return 0;
     }
     float res=n+sum(n-1);
     
    return res;
 } /*
 static int factorial(int n){
     int res=1;
     if(n<=1){
         return n;
      return  res= factorial(n-1)+factorial(n-2);
     }
     return res;

 }   */
 
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
 
    public static void main(String[] args) {
        forloop(10);
        System.out.println(sum(4));
        int a[]={2,4,6,3,7,8};
        // System.out.println(maxnum(a));
        System.out.println(fib(9));
    }
}
