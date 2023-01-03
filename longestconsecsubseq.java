class Solution
{   

	static int findLongestConseqSubseq(int arr[], int N)
	{
HashSet<Integer> set = new HashSet<>();
	   for(int num:arr) set.add(num);
	   int count=0;
	   for(int num:arr){
	       if(!set.contains(num-1)){
	           int cons =1;
	           int currentNum = num;
	           while(set.contains(currentNum+1)){
	               currentNum+=1;
	               cons+=1;
	           }
	           count=Math.max(count,cons);
	       }
	       
	   }
	   return count;
	}
}
