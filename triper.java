public class triper {
    public static void main(String[] args) {
        int arr[]={1, 5, 3, 2};
        int n=arr.length;
        int temp=0;
    // for(int i=0;i<n;i++){
    //     for(int j=i;j<n-1;j++){
    //         for(int k=j+1;j<n;j++){
    //             if(a[i]+a[j]==a[k] || a[j]+a[k]==a[i] || a[i]+a[k]==a[j] ){
    //             ++temp;
    //             }
    //         }
    //     }
    // }
    
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n-1;j++){
	            for(int k=j+1;k<n;k++){
	                if(arr[i]+arr[j]==arr[k] || arr[j]+arr[k]==arr[i]||arr[i]+arr[k]==arr[j]){
	                    temp=temp+1;
	                }
	            }
	        }
	    }
    System.out.println(temp);
    }
    
}
