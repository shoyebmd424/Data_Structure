public class prime {
     public static void main(String[] args) {
         int flag;
         int r=0;
        int b=3;
        for(int i=2;i<b;i++){
     flag=b%i;
     if(flag==0){
         r=1;
         break;
     }
    }
    if(r!=0)
    {
        System.out.println("its not prime no."); 
    }
    else{
        System.out.println("its prime no.");
    }
   
    }
}
