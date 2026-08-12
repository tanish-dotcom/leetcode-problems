class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()){
                char top = stack.peek();
                if(top==ch){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
}