package string;

public class wordreverse {
public static void main(String[] args) {
    String name ="this is my coding world";
   String[] word =name.split(" ");
   for(String w:word){
       System.out.println(w);
   }
   for(int i=word.length-1;i>0;i--){
       System.out.print(" "+word[i]);
   }
}    
}
