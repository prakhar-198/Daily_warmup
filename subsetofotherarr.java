class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
     HashMap <Long,Long> set=new HashMap<>();
     for(int i=0;i<a1.length;i++){
         if (set.containsKey(a1[i])){
         set.put(a1[i],set.get(a1[i])+1);
         }else{
           set.put(a1[i],(Long.valueOf(1)));  
         }
     }long count=0;
     for(int i=0;i<a2.length;i++){
         if (set.containsKey(a2[i])&& set.get(a2[i])>0){
             count++;
             set.put(a2[i],set.get(a2[i])-1);
         }else{
            
         }
     }if(count==a2.length){
         String s="Yes";
         return s;
     }else{
         String s="No";
         return s;
     }
    }
}
