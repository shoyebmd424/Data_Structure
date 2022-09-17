public class shiftnegpasi {
public static void main(String[] args) {
    int a[]={1,-2,-4,0,3,-4,-5,-1};
    int n=a.length;
    int temp=0,j=0;
    int c[]=new int [n];
   
    for(int i=0;i<n;i++){
        if(a[i]>=0){
            if(j!=i){
                c[j]=a[i];
            }
            j++;
        }
    }
    for(int i=0;i<n;i++){
        if(a[i]<0){
            if(j!=i){
                c[j]=a[i];
            }
            j++;
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(" "+c[i]);
    }
}
    
}
