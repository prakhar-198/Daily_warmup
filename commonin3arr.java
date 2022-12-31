class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
       LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
       for(int i=0; i<A.length;i++){
     
           map.put(A[i],1);
       
       }
       for(int i=0; i<B.length;i++){
       if(map.containsKey(B[i])){
           map.put(B[i],2);
       }
       }
       for(int i=0; i<C.length;i++){
       if(map.containsKey(C[i])&& map.get(C[i])==2){
           map.put(C[i],3);
       }
       }ArrayList<Integer> res=new ArrayList<Integer>();
       for(Map.Entry<Integer,Integer>element:map.entrySet()){
           int n=element.getValue();
           if(n==3){
               int l=element.getKey();
               res.add(l);
           }
       }
       return res;
    }
}
