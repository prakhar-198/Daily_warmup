class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the functionli
     int fav=0;
     int nonfav=0;
     for(int i=0;i<n;i++){
         if(arr[i]<=k)fav++;
     }
    for(int i=0;i<fav;i++){
         if(arr[i]>k)nonfav++;
     }
     int l=0,r=fav-1,result=Integer.MAX_VALUE;
     while(r<n)
     {
         result=Math.min(result,nonfav);
         r++;
         if(r<n && arr[r]>k)nonfav++;
         if(l<n && arr[l]>k)nonfav--;
         l++;
     }
     return (result==Integer.MAX_VALUE)?0:result;
}
}
