import java.util.*;

public class LongestSubArrayAfterFlip {
    public static int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0};
        System.out.println("Longest subarray of 1s after flipping at most one 0: " + longestSubarray(nums));
    }
}
