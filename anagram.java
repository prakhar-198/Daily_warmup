class Solution {
    public boolean isAnagram(String s, String t) {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        s = new String(sArray);
        t = new String(tArray);

        if(s.equals(t)){
            return true;
        }
        else {
            return false;
        }
    }
}
