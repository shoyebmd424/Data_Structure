public class maxdiffirence {
    public static void main(String[] args) {
        int max=0;
        int count=0;
        int a[]={2, 7, 9, 15, 1, 3, 5};
        int min=a[0];
          for(int i=0;i<a.length;i++){
            
              if(a[i]>a[i+1]){
                  max=a[i];
                  count=i;
                  break;
              }
          }
          System.out.println(count);
          for(int j=0;j<count;j++){
              if(min>a[j]){
                  min=a[j];
              }
          }
          System.out.println(min);
        System.out.println(max);
        int diff=max-min;
        System.out.println(diff);
    }
    
}
