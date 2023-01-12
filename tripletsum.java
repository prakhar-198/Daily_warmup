class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
     Arrays.sort(A);

       for(int i=1;i<n-1;i++)

       {

           int start=0;

           int end=n-1;

           while(start<i&&i<end)

           {

               if((A[i]+A[start]+A[end])==X)

               return true;

               

               if((A[i]+A[start]+A[end])>X)

               end--;

               else

               start++;

           }

       }

       return false;
    
    }
}
