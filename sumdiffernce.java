public class sumdiffernce {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 2};
        int sum=0,sum2=0;
        for(int i=0;i<a.length/2;i++){
            sum=sum+a[i];
        }
        for(int i=a.length/2;i<a.length;i++){
            sum2=sum2+a[i];
        }int temp=0;
        if(sum>sum2){
        temp=sum-sum2;
        }
        else{
            temp=sum2-sum;
        }
        System.out.println(sum+" "+sum2);
        System.out.println(temp);
    }
    
}
