package recursion;
public class strrev {
    static void  strreverse(String str ,int indx){
        if(indx==str.length()){
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        strreverse(str, indx-1);
    }

    static int  first=-1;
    static int  last=-1;
    static void fistlastoccur(String str, int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cur=str.charAt(idx);
        if(cur==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        fistlastoccur(str, idx+1, element);
    }

    public static void main(String[] args) {
        String st="ajdsfjdssa";
        char e='j';
        int l=st.length()-1;
        // strreverse(st, l);
        fistlastoccur(st, 0,e );
    }
    
}
