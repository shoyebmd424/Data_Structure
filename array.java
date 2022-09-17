public class array{
    public static void main(String[] args){
 int a[] ={1,2,3,4,5};
    //  int a=6,b=9;
  int b[]=new int[14];
  for(int i=3;i<a.length;i++)
  {
      b[i]=a[i];
  }
  for(int i=b.length-1;i>0;i--){
      a[i]=b[i];
  }
  for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
  }
    
    }
}