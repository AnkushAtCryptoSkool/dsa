package src.dsa;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int arr[] = {1,2,3,45,6,4};
        System.out.println(longestConsecutive.longestConsecutive(arr));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // Edge case

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : nums) {
            // Check if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
}
