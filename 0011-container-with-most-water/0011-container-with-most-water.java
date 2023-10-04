class Solution{
    public int maxArea(int[] height){
        int n = height.length;
        int l = 0;
        int r = n-1;
        int ans = 0;
        while(l<r){
            int tmp = Math.min(height[l], height[r])*(r-l);
            ans = Math.max(ans, tmp);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return ans;
    }
}