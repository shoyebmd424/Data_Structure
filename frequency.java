import javax.swing.plaf.synth.SynthSplitPaneUI;

public class frequency {
 public static void main(String[] args) {
     int a[] ={1,2,3,5,5,6,3,4,53,2,5};
     int r,temp=0,input=5;
     for(int i=0;i<a.length;i++){
       
        r=input^a[i];
         if(r==0){
          temp=temp+1;
         }
         
     }
System.out.println(temp); }
    
}
