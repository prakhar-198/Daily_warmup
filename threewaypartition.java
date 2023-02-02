class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int low = 0;
        int mid = 0;
        int high = array.length-1;
        
        while(mid<=high){
            if(array[mid]<a){
                swap(mid,low,array);
                mid++;
                low++;
            }
            else if(array[mid]>b){
                swap(mid,high,array);
                high--;
            }
            else mid++;
    }
    }
    public void swap(int c,int b, int a[]){
        int temp=a[c];
        a[c]=a[b];
        a[b]=temp;
        
    
    }
}
