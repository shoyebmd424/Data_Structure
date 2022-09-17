package DP;
public class subset {
  static  int sub(int a[], int n, int sum){
      int t[][]=new int[sum+1][n+1];
   
      for(int i=0;i<n+1;i++){
        t[0][i]=1;
      }
      for(int i=1;i<sum+1;i++){
        t[i][0] = 0;
      }
      for(int i=1;i<=sum;i++){
        for(int j=1;j<=n;j++){
            t[i][j] = t[i][j - 1];
            if(i>=a[j-1]){
                t[i][j]=t[i][j]+t[i-a[j-1]][j-1];
            }
        }
      }
      return t[sum][n];
    }
    static boolean partition(int a[], int n){
        int sum=0;
        for(int it:a){
            sum+=it;
        }
        if(sum%2!=0){
            return false;
        }
        return subs(a, n, sum/2);
    }
  static  boolean subs(int a[], int n, int sum){
      boolean t[][]=new boolean[sum+1][n+1];
   
      for(int i=0;i<n+1;i++){
        t[0][i]=true;
      }
      for(int i=1;i<sum+1;i++){
        t[i][0] = false;
      }
      for(int i=1;i<=sum;i++){
        for(int j=1;j<=n;j++){
            t[i][j] = t[i][j - 1];
            if(i>=a[j-1]){
                t[i][j]=t[i][j]||t[i-a[j-1]][j-1];
            }
        }
      }
      return t[sum][n];
    }
    static int minimusSum(int arr[], int sum, int cursum,int  n){
        if(n==0){
            return (sum-cursum);
        }
        return Math.min(minimusSum(arr, sum, cursum+arr[n-1], n-1), minimusSum(arr, sum, cursum, n-1));

    }
    static int minicall(int arr[],int n){
        int sum=0;
        for(int it:arr){
            sum+=it;
        }
        return minimusSum(arr, sum, 0, n);
    }
    static int topmini(int arr[], int n){
        int sum=0;
        for(int it:arr){
            sum+=it;
        }
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=sum;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                dp[i][j]=dp[i-1][j];
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]];
                }
            }
        }
        int diff=Integer.MIN_VALUE;
        for(int i=sum/2;i>=0;i--){
                if(dp[n][i]==true){
                    diff=sum-2*i;
                    break;
                }
        }
        return diff;

    }
    static int countdiff(int a[],int n,int diff){
        int sum=0;
        for(int it:a){
            sum+=it;
        }
        int s1=(sum+diff)/2;
        return sub(a, n, s1);
    }

    public static void main(String[] args) {
        int a[]={1,3,5};
        int b[]={1,1,2,3};
    //   System.out.println(  sub(a, a.length,8));;
    // System.out.println(partition(a, a.length));
    // System.out.println(minicall(a, a.length-1));
    // System.out.println(topmini(a, a.length));
    // System.out.println(countdiff(b, b.length, 1));
    System.out.println("this");
    System.out.println("this");
    System.out.println(revese(121));
    }
    static int revese(int x){
        int rev=0;
        while(x>0){
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
       return rev;
    }
}
