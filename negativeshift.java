import java.util.LinkedList;
import java.util.Queue;

public class negativeshift {
    // without oerder in oerder 
    static void rearramge(int a[]){
    int i=-1;
    int temp[]=new int[a.length];
    for(int j=0;j<a.length;j++){
        if(a[j]<0){
            i++;
            temp[i]=a[j];
            swap(a, i, j);
        }
    }
    }
    static void swap(int a[],int i,int j){
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    }

   static void withorder(long a[],long n){
        int k=0;
        Queue<Long> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(a[i]<0){
                a[k]=a[i];
                k++;
            }
            else{
                q.offer(a[i]);
            }
        }
        for(int j=k;j<n;j++){
            a[j]=q.poll();
        }
    }
    public static void main(String[] args) {
        long a[]={-1,2,-3,4,5,6,-7,8,9};
        // rearramge(a);
        withorder(a,a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
