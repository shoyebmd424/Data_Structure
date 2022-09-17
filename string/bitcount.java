package string;

import java.util.Arrays;
import java.util.Comparator;

public class bitcount {
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(15));
    }
    
}
class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        Arrays.sort(arr,new compare());
        return;
    
    } 
  
}
class compare implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        int one1=Integer.bitCount(a);
        int one2=Integer.bitCount(b);
        if(one1>one2) return -1;
        else if(one2>one1) return 1;
        return 0;
    }
}