public class longestname {
    public static void main(String[] args) {
        String a[]={"this","you","can"};
        int l=a[0].length();
        int j=0;
        String temp="";
    for(int i=0;i<a.length;i++){
        if(l<a[i].length()){
            l=a[i].length();
            j=i;
            temp=a[i];
        }
    }
    System.out.println(temp);
    }
    
}
