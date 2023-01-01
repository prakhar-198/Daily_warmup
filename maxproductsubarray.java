class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long ans=arr[0];
        long min=arr[0];
        long ma=arr[0];
        for(int i=1;i<arr.length;i++){
          if(arr[i]<0){
              long temp=ma;
              ma=min;
              min=temp;
          }
          ma=Math.max(arr[i],arr[i]*ma);
          min=Math.min(arr[i],arr[i]*min);
          ans=Math.max(ans,ma);
        }return ans;
    }
}
