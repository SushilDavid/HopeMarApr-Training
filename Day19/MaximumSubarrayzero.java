package Day19;
import java.util.HashMap;
public class MaximumSubarrayzero {
    public int maxLen(int arr[], int n) {
        // Your code here
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        MaximumSubarrayzero obj = new MaximumSubarrayzero();
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        System.out.println("Length of the longest 0 sum subarray is " + obj.maxLen(arr, n));
}}
