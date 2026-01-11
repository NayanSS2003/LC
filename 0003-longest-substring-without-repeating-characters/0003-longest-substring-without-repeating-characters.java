public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String currentWindow = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (currentWindow.contains(String.valueOf(c))) {
                currentWindow = ""; 
            }
            currentWindow += c;
            maxLength = Math.max(maxLength, currentWindow.length());
        }
        return maxLength;
    }
}