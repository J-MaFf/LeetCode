// Given a string s, return the longest palindromic substring in s.

class Solution {
    public String longestPalindrome(String s) {
        // I plan to use the sliding window aproach

        int left = 0, right = 0;
        int l = 0, r = 0;
        String palindrome = "";
        String currentSubstring = "";

        if (s.length() == 1)
            return s;

        for (int i = 0; i < s.length(); i++) {

            currentSubstring = s.substring(left, right);

            while (isPalindrome(currentSubstring)) {
                if (currentSubstring.length() > palindrome.length())
                    palindrome = currentSubstring;
                if (left > 0) {
                    left--;
                    l++;
                }
                if (right <= s.length() - 1) {
                    right++;
                    r++;
                } else
                    break;

            }
            // Update current substring
            left += l + 1;
            right -= r - 1;
            currentSubstring = s.substring(left, right);

            l = 0;
            r = 0;
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