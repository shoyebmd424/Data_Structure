package recursion;

public class towerhonoi {
    public static void towerofhanoi(int n ,String src,String helper,String desti){
        if(n==1){
            System.out.println(" transfer disk "+n+"from "+src+" to "+desti);
            return;
        }
        towerofhanoi(n-1, src, desti, helper);
        System.out.println(" transfer disk "+n+"from "+src+" to "+desti);
        towerofhanoi(n-1, helper, src, desti);
    }
    public static void main(String[] args) {
        int n=2;
        towerofhanoi(n, "s", "H", "D");
    }
}
