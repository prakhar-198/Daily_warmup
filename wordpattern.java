class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character,String> map=new HashMap<>();
        String[] word=s.split(" ");
        if(pattern.length()!=word.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
		// for case like a b b a -> dog dog dog dog
            if(map.containsValue(word[i]) && map.containsKey(pattern.charAt(i))==false)
                return false;
            if(map.containsKey(pattern.charAt(i))==false)
                map.put(pattern.charAt(i),word[i]);
            else
            {
                String str=map.get(pattern.charAt(i));
                if(!str.equals(word[i])) 
                    return false;
            }
        }
        return true;
            
    }
}
