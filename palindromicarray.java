class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<a.length;i++){
                      int rev=0;
                      int l=a[i];
                      while(l>0){
                          int d=l%10;
                           rev=rev*10+d;
                           l=l/10;
                          
                      }
                    if(rev!=a[i]){
                        return 0;
                    } 
                  }return 1;
           }
}
