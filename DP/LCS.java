package DP;

import java.util.PriorityQueue;

import Queue.priority;

public class LCS {
   static int mat[][]=new int[1000][1000];
    static int lcs(char[] a, char[] b){
        for(int i=0;i<=a.length;i++){
            mat[i][0]=0;
        }
        for(int i=0;i<=b.length;i++){
            mat[0][i]=0;
        }
        for(int i=1;i<=a.length;i++){
            for(int j=1;j<=b.length;j++){
                    if(a[i-1]==b[j-1]){
                        mat[i][j]=1+mat[i-1][j-1];
                    }else{
                         mat[i][j]= Math.max(mat[i-1][j], mat[i][j-1]);
                    }
            }
        }
        return mat[a.length][b.length];
    }
    static void printlcs(char a[], char b[],int m, int n){
            int i=m,j=n;
            String temp="";
            while(i>0&j>0){
                if(a[i-1]==b[j-1]){
                    temp+=a[i-1];
                    i--;
                    j--;
                }else {
                    if(mat[i-1][j]>mat[i][j-1]){
                        j--;
                    }else{
                        i--;
                    }
                }
            }
            System.out.println(temp);
    }
    static void lcsprint(char a[], char[] b, int m, int n){
            if(n==0||m==0){
                return;
            }
            if(a[m-1]==b[n-1]){
                System.out.print(a[m-1]);
                lcsprint(a, b, m-1, n-1);
            }else{ if(m>n){
                lcsprint(a, b, m-1, n);
            }else{
                lcsprint(a, b, m, n-1);
            }
            }
    }
    public static void main(String[] args) {
        String a="abcd";
        char t[]=a.toCharArray();
        String b="bcdef";
        char k[]=b.toCharArray();
       lcsprint(t, k, t.length, k.length);
    }





    static boolean ispalind(String  str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
           }
           if(rev.equals(str)){
             return true;
           }
           else
           return false;
    }
    static String longestpalind(String str){
        int i=0;
        int n=str.length();
        String ans="";
        int j=i+1;
        while(i<n-2){
            while(!ispalind(str.substring(i, j))&&j<n-1)
            {
            j++;
            }
            if(ispalind(str.substring(i, j))){
               if(ans.length()<str.substring(i, j).length()){
                ans=str.substring(i, j);
               }
                j++;
            }else{
            i++;
        }
        }
        return ans;
    }



    static String reverse(String str){
        String temp="";
      for(int j=str.length()-1;j>=0;j--){
        temp+=str.charAt(j);
      }
        return temp;
    }
}
