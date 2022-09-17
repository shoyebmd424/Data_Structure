import java.math.MathContext;

public class maxisum {
public static void main(String[] args) {
    int a[]={-2 ,1 ,-3, 4 ,-1, 2, 1, -5, 4};
    int l=a.length;
    System.out.println(highestsum(a, l));
}   
static int highestsum(int a[] ,int n){
 int sum=0;
 int maxisum=0;
 for(int i=0;i<n;i++){
         sum=sum+a[i];
         if(maxisum<sum){
             maxisum=sum;
         }
        // else if(sum<0 || a[0]>sum){
        //     maxisum=a[0];
        // }
    }
    return sum;
  
}
}
