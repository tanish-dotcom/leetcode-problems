class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();

                if(Character.toLowerCase(top) == Character.toLowerCase(ch) && Character.isLowerCase(top) != Character.isLowerCase(ch)){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : stack){
            ans.append(ch);
        }
        return ans.toString();
    }
}