class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //length of array
        int n=nums.length;
        int left=0; //left pointer
        int right=0; //right pointer
        int sum=0; //for storing the sum value
        int min=Integer.MAX_VALUE; //for storing the subarray size
        //run untill right ptr goes out of bound
        while(right<n)
        {
          //add the right value to sum
          sum+=nums[right];

          //check if currentsum >=target
          if(sum>=target){ //when sum goes greater than  target compress left ptr
            while(sum>=target){
               sum-=nums[left]; 
               left++;
             }
            min=Math.min(min,right-left+2); //right-left+2 to find the window size
           }
          right++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
