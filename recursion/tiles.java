package recursion;

public class tiles {
    public static int tiles(int n, int m){        // tiles size 1*m
         if(n==m){
             return 2;
         }
         if(n<m){
             return 1;
         }
        int horizintal=tiles(n-m, m);
        int vertical=tiles(n-1, m);
        return horizintal+vertical;
    }
    public static void main(String[] args) {
        int m=2,n=2;
        System.out.println(tiles(n, m));
    }
    
}
