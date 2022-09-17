public class cherectersame {
    static void same(int a[], int k) {
        if (a.length == 1)
            return;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                System.out.println(i);
                break;
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == k) {
                System.out.println(i);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
     int arr[]=   { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
      same(arr, 7);
    }

}
