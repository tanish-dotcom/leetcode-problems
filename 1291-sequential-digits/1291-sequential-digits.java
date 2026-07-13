class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        int minlen = String.valueOf(low).length();
        int maxlen = String.valueOf(high).length();
        for(int len = minlen; len<=maxlen; len++){
            for(int start = 0; start<=9-len; start++){
                String str = s.substring(start,start+len);
                int num = Integer.parseInt(str);
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}