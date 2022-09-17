public class connectarray {
    public static void main(String[] args){
        int a[]={1,2,4,6,7};
        int b[] ={3,4,5};
        int c[] =new int[a.length+b.length];
        for(int i=0;i<b.length;i++)
        {
            c[i+a.length]=b[i];
        }
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<a.length+b.length;i++){
            System.out.println(c[i]);
        }
    } 
}
