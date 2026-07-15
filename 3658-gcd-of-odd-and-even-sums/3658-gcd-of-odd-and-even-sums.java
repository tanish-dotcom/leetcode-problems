class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = n*n;
        int evensum = n*(n+1);
        while(evensum != 0){
            int temp = evensum;
            evensum = oddsum%evensum;
            oddsum = temp;
        }
        return oddsum;
    }
}