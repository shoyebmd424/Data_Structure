package recursion;

public class sortC {
    static boolean sortedcheck(int a[], int n) {
        if (n == a.length - 1) {
            return true;
        }
        if (a[n] < a[n + 1]) {
            // return true;
            return sortedcheck(a, n + 1);
        } else {
            return false;
        }
    }

    static void xaddedend(String str, int count, int idx, String newstr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char cur = str.charAt(idx);
        if (cur == 'x') {
            count++;
            xaddedend(str, count, idx + 1, newstr);
        } else {
            newstr += cur;
            xaddedend(str, count, idx + 1, newstr);
        }

    }

    public static void main(String[] args) {
        // int a[]={1,4,6,9 ,9,10};
        // System.out.println(sortedcheck(a, 0));
        String name = "abxxdxs";
        xaddedend(name, 0, 0, "");

    }

}
