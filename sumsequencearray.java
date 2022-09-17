import java.lang.annotation.Target;

public class sumsequencearray{
    public static void main(String[] args) {
        int a[] ={1,3,-5,5,7,7,8};
        int sum=0,target=10,end=0;
        int start=0;
       for(int i=0;i<a.length;i++){
           start=i;
           for(int j=i;j<a.length;j++){
               sum=sum+a[j];
               System.out.println("printsum:"+sum);

               if(sum==target){
                   end=j;
                   System.out.println("print j"+j);
                   break;
               }               
           }
           if(target==sum){
            break;
        }    else{
            sum=0;
        }
       }
       System.out.println(end);
        
    }
}