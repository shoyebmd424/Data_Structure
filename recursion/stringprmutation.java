package recursion;

public class stringprmutation {
    static void premutation(String str, String premu) {
        if (str.length() == 0) {
            System.out.println(premu);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            premutation(newstr, premu + cur);
        }
    }

    public static void main(String[] args) {
        String st = "abc";
        premutation(st, "");
        System.out.println(st.substring(1));
    }

}
