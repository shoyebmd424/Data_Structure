
public class palindrome {
    public static void main(String[] args) {
int num =324;
int rev=0,r=0;
while(num>0){
    r=num%10;
    rev=rev*10+r;
    num=num/10;
}  
System.out.println(rev);
  }
    
}
