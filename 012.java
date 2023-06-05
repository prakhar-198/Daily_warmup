class Solution
{
    public static void sort012(int a[], int n)
    {int count0,count1,count2;
    count0=0;
    count1=0;
    count2=0;
        // code here 
        for (int i=0;i<a.length;i++){
            if(a[i]==0)count0++;
            else if(a[i]==1)count1++;
            else count2++;
        }int i=0;
        while(count0>0 && i<a.length){
            
            a[i]=0;
            count0--;
            i++;
        }
         while(count1>0 && i<a.length){
            a[i]=1;
            count1--;
            i++;
        }
         while(count2>0 && i<a.length){
             
            a[i]=2;
            count2--;
            i++;
        }
    }
}
