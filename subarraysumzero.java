
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer>map=new HashSet<>();
        int sum=0;
        map.add(sum);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(map.contains(sum)){
                return true;
            }else{
               map.add(sum);
            }
        }return false;
    }
}
