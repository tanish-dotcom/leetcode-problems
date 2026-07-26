class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n1 = new HashSet<>();
        for(int num:nums){
            if(n1.contains(num)){
                return true;
            }
            n1.add(num);
        }
        return false;
    }
}