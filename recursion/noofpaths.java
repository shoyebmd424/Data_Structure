package recursion;

public class noofpaths {
    public static int npathsmatrinx(int i,int j,int m,int n){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }
        int downpaths=npathsmatrinx(i+1, j, m, n);
        int right=npathsmatrinx(i, j+1, m, n);
        return downpaths+right;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(npathsmatrinx(0, 0, m, n));
    }
    
}
