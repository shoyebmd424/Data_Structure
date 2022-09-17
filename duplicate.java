public class duplicate {
    public static void main(String[] args) {
        int a[] = { 1, 2,3,3,4,5 };
        int dup = a[0];
        for (int i = 1; i < a.length; i++) {
            if ((dup ^ a[i]) == 0) {
                dup = a[i];
            }
        }
        System.out.println(dup);
       int n= removedupli(a, a.length);
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
    static int removedupli(int a[],int n){
        int j=0;
        for(int i=0;i<n-1;i++)
            if(a[i]!=a[i+1])
           a[j++]=a[i];
        a[j++]=a[n-1];
        return j;
    }

}