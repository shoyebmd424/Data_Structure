package string;
   // count and say DSA question
public class countsay {
    public static void main(String[] args) {
        int n = 6;
      
    if (n == 1) {
            System.out.println("1");
        }
        if (n == 2) {
            System.out.println("11");
        }
        String str = "11";
        for (int i = 3; i <= n; i++) {
            str = str + "&";
            String temp = "";
            int count = 1;
            int l = str.length();
            for (int j = 1; j < l; j++) {
                if (str.charAt(j) != str.charAt(j-1)) {
                    temp = temp + String.valueOf(count);
                    temp = temp + str.charAt(j-1);
                    count = 1;
                } else {
                    count++;
                }
            }
            str=temp;
        }
        System.out.println(str); 
    }

}
