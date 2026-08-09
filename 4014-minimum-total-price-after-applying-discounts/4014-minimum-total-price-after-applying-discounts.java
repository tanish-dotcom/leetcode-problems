import java.util.Arrays;

class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int n = prices.length;
        int m = discounts.length;

        double sum = 0;

        // Case 1: discounts kam hain
        if (m < n) {

            int noDiscount = n - m;

            // Smallest prices -> no discount
            for (int i = 0; i < noDiscount; i++) {
                sum += prices[i];
            }

            // Remaining prices -> discounts
            for (int i = noDiscount; i < n; i++) {

                int discountIndex = i - noDiscount;

                sum += prices[i] * (100 - discounts[discountIndex]) / 100.0;
            }
        }

        // Case 2: discounts zyada ya equal hain
        else {

            int extraDiscounts = m - n;

            // Smallest discounts unused
            // Remaining discounts largest prices ke saath pair honge
            for (int i = 0; i < n; i++) {

                int discountIndex = extraDiscounts + i;

                sum += prices[i] * (100 - discounts[discountIndex]) / 100.0;
            }
        }

        return sum;
    }
}