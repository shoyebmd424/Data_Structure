import java.util.ArrayList;

public class subarraygiven {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
  int r=0;
  int l=0;
  int sum=0;
  while(r<n){
      sum+=arr[r++];
      while(sum>s){
          sum-=arr[l++];
      }
      if(sum==s){
          list.add(l+1);
          list.add(r);
          return list;
      }
  }
  list.add(-1);
  return list;
}
    
    public static void main(String[] args) {
        int a[]={15,-2,2,-8,1,7,10,23};
      System.out.println(  subarraySum(a, 5, 0));
    }

  
    
}
