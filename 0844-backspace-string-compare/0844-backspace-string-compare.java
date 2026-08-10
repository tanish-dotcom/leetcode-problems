class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S1 = new Stack<>();
        Stack<Character> T1 = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch =='#'){
                if(!S1.isEmpty()){
                    S1.pop();
                }
            }
            else{
                    S1.push(ch);
                }
        }

        for(char ch : t.toCharArray()){
            if(ch=='#'){
                if(!T1.isEmpty()){
                    T1.pop();
                }
            }
            else{
                    T1.push(ch);
                }
        }

        if(S1.size() != T1.size()){
            return false;
        }
        while(!S1.isEmpty()){
            if(S1.pop() != T1.pop()){
                return false;
            }
        }
        return true;
    }
}