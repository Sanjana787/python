import java.util.* ;
import java.io.*; 
public class Solution {
    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        long totalSum = 0;
        for (int i = 0; i < n; i++)
            totalSum += arr.get(i);

        long maxSum = Long.MIN_VALUE, dp = 0;
        for (int i = 0; i < n; i++) {
            dp = Math.max(1L * arr.get(i), dp + arr.get(i));
            maxSum = Math.max(maxSum, dp);
        }

        long cirSum = Long.MIN_VALUE;
        dp = 0;
        for (int i = 0; i < n; i++)
            arr.add(arr.get(i));
        for (int i = 0; i < 2 * n; i++) {
            dp = Math.max(1L * arr.get(i), dp + arr.get(i));
            cirSum = Math.max(cirSum, dp);
        }

        if (k == 1)
            return maxSum;
        return Math.max(maxSum, Math.max(1L * (k - 2) * totalSum + cirSum, cirSum));
    }

	
}

