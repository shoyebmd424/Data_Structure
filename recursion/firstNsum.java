package recursion;
public class firstNsum {
    static int recursion(int N ,int sum){
        if(N==0){
            return sum;
        }
        sum=N+recursion(N-1, sum);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(recursion(4, 0));
    }
}
