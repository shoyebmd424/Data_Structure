public class heapify {
    
    public static void main(String[] args) {
        int a[]={5,4,9,7,19,8,17,2,6,5,21};
       build(a, a.length);       
       for(int i=0;i<a.length;i++){
           System.out.print(" "+a[i]);
       }
       System.out.println(" ");
     heapsort(a, a.length);
       for(int i=0;i<a.length;i++){
        System.out.print(" "+a[i]);
    }
    }
    static void build(int a[],int n){
        int stindex=n/2-1;
        for(int i=stindex;i>=0;i--){
            heap(a, n, i);
        }
    }
  static void delete(int a[]){
      a[0]=a[a.length-1];
      heap(a, a.length, 0);
      a[a.length-1]=0;
  }
  static void heapsort(int a[],int n){
    //   for(int i=n/2;i>0;i--){
    //       heap(a, n, i);
    //   }
    build(a, n);
      for(int i=n-1;i>0;i--){
          int temp=a[i];
          a[i]=a[0];
          a[0]=temp;
       heap(a, i, 0);
      }
  }

  /* max heap
    static void heap(int a[],int n,int i){
        int larger=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && a[larger]<a[left])
        larger=left;
        if(right<n && a[larger]<a[right])
        larger=right;
        if(larger!=i){
        int temp=a[i];
        a[i]=a[larger];
        a[larger]=temp;
        heap(a, n, larger);
        }
    }  */
    static void heap(int a[],int n,int i){
        int larger=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && a[larger]>a[left])
        larger=left;
        if(right<n && a[larger]>a[right])
        larger=right;
        if(larger!=i){
        int temp=a[i];
        a[i]=a[larger];
        a[larger]=temp;
        heap(a, n, larger);
        }
    }
}
