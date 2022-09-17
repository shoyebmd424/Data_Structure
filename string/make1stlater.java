package string;

public class make1stlater {
    public static void main(String[] args) {
        String name="this is my name";
        String a[]=name.split(" ");
        for(String c:a){
            System.out.println(c);
        }
        String s="";
        for(int i=0;i<a.length;i++){
            s=s+a[i].charAt(0);
        }
        System.out.println(s);

            
        }
    
    
}
