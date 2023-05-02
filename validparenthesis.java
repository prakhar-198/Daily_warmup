class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String openBrackets = "{([";
        for(int i=0; i<s.length(); i++){
            Character temp = s.charAt(i);
            if(openBrackets.indexOf(temp)> -1){
                stack.add(temp);
            }else{
                
                if(stack.isEmpty()){
                    return false;
                }else if(helper(stack.peek())!=temp){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.empty() ? true : false;
    }

    private Character helper(Character left){
    
        if(left == '('){
            return ')';
        }else if(left == '{'){
            return '}';
        }else{
            return ']';
        }
    }
}
