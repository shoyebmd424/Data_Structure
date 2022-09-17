
public class sumzero {
    public static void main(String[] args) {

        int a[] = { 1, -4, 3, 4, -2, -4 };
        for (int j = 0; j < a.length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i];
                System.out.print(a[i] + " ");
                if (sum == 0) {
                    break;
                }
            }
            System.out.println(" ");
        }
    }

}
