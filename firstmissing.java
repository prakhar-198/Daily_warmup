class Solution {
    public int firstMissingPositive(int[] nums) {
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
         set.add(nums[i]);
       }
       ArrayList<Integer> arr=new ArrayList(set);
       for(int i=0;i<arr.size();i++){
        if(arr.get(i)>0 ){
       pq.add(arr.get(i));
        }
       }int temp=0;
       if(pq.size()==0)return 1;
       if(pq.peek()>1)return 1;
       while(pq.size()>0 ){
        temp=pq.peek();
        pq.remove();
        if(pq.size()>=1){
        if(pq.peek()!=temp+1){
            return temp+1;
        }
        }
       }return temp+1;
       }


}
