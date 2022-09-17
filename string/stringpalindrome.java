package string;

import javax.print.DocFlavor.STRING;

public class stringpalindrome {
public static void main(String[] args) {
  String name="abba";
  System.out.println(name);
  String rev="";
  for(int i=name.length()-1;i>=0;i--){
 rev=rev+name.charAt(i);
}
System.out.println(rev);
if(rev.equals(name)){
    System.out.println("it is palindrome string");
}
else
System.out.println("it is not palindrome number");
}    
}
