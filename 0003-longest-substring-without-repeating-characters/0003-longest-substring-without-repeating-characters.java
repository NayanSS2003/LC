public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            int duplicateIndex = s.indexOf(s.charAt(right), left);
            if (duplicateIndex != -1 && duplicateIndex < right) {
                left = duplicateIndex + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}