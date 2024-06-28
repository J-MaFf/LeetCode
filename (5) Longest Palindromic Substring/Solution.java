// Given a string s, return the longest palindromic substring in s.

class Solution {
    public String longestPalindrome(String s) {
        // I plan to use the sliding window aproach

        int left, right;
        String palindrome = "";
        String currentSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            left = right = i;
            currentSubstring = s.substring(left, right);
            while (isPalindrome(currentSubstring)) {
                if (currentSubstring.length() > palindrome.length())
                    palindrome = currentSubstring;
                if (left > 0)
                    left--;
                if (right < s.length() - 1)
                    right++;
                // Update current substring
                currentSubstring = s.substring(left, right);
            }
        }
        return palindrome;

    }

    /**
     * This function checks if a string is a palindrome
     * 
     * @param s the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (right - left > 0) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}