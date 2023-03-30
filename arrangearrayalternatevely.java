class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
  
    
        public static void rearrange(long arr[], int n){
        
        Arrays.sort(arr);
        long []arr1 = new long[n];
        int i=0;
        int lIndex=0;
        int rIndex=n-1;
        
        while(i<n){
            if(i%2==0 || i==0){
                arr1[i] = arr[rIndex];
                rIndex--;
                i++;
            }else{
                arr1[i] = arr[lIndex]; 
                lIndex++;
                i++;
            }
            
        }
        for(i=0;i<n;i++){
            arr[i] = arr1[i];
        }
    }
    }
/*
Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.

*/
