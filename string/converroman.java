package string;

public class converroman {
 
    public static String convertRoman(int x){
     int num[]={ 1,4,5,9,10,40,50,90,100,400,500,900,1000};
     String[] romanval={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
     int i=12;
     String roman="";
     while(x!=0){
         if(num[i]<=x){
             roman+=romanval[i];
             x=x-num[i];
         }
         else{
             i--;
         }
     }
     return roman;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(convertRoman(n));
       
    }
    
}
