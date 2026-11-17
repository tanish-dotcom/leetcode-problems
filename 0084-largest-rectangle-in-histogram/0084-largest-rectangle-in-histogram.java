
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] prev = new int[n];
        int[] nxt = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            prev[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            nxt[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int w = nxt[i] - prev[i] - 1;
            int a = w * heights[i];

            max = Math.max(max, a);
        }

        return max;
    }
}
