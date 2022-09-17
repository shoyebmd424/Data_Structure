
public class chocolate {
    public static void main(String[] args) {
    int a[] ={2,4,7,2,2};
    int min=a[0];
    int n=a.length;
    for(int i=0;i<n;i++){
        if(min>a[i]){
            min=a[i];
        }
    }
System.out.println(min);
}
}