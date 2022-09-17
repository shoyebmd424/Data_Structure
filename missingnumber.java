public class missingnumber {
    public static void main(String[] args) {
        int array[]={2};

        int sum=0,netsum=0,max=array[0];
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
            if(max<array[i]){
                max=array[i];
            }
        }
        
        for(int i=0;i<=max;i++){
            netsum=netsum+i;
        }
        System.out.println(netsum+" "+sum+" "+max);
        int number=netsum-sum;
        System.out.println(number);
    }
    
}
