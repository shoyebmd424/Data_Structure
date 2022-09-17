public class halfreverse {
    static void half(int a[],int start,int last){
    while(start<last){
        swap(a, start, last);
        start++;
        last--;
    }
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int a[]={4, 3, 7, 8, 6, 2, 1};
        // half(a, 0, 3);
        zigZag(a, a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }

    }
   static void zigZag(int arr[], int n) {
        if(n==1){
            return;
        }
        // code here
        boolean flag=true;
        for(int i=0;i<=n-2;i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    swap(arr ,i,i+1);
                }
            }
            flag=!flag;
        }
    }
 static   void swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    
}
