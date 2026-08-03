class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = k-1;
        int sum = 0;
        for(int i=0; i<k; i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                sum++;
            }
        }
        int maximum = sum;
        while(r < arr.length-1){
            if(arr[l]=='a' || arr[l]=='e' || arr[l]=='i' || arr[l]=='o' || arr[l]=='u'){
                sum = sum-1;
            }
            l++;
            r++;
            if(arr[r]=='a' || arr[r]=='e' || arr[r]=='i' || arr[r]=='o' || arr[r]=='u'){
                sum = sum+1;
            }
            maximum = Math.max(maximum, sum);
        }
        return maximum;
    }
}