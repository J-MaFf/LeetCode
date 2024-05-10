
/*
 *  Given a string s, find the length of the longest

    out repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

 */
import java.util.HashSet;

/**
 * This class provides a solution for finding the length of the longest
 * substring without repeating characters.
 */
class Solution {

    /**
     * Calculates the length of the longest substring without repeating characters.
     * It does this by iterating through the input string and adding each character
     * to a hash set.
     * If the character is not in the hash set, it is added to the longest common
     * substring (lcs).
     * If the character is already in the hash set, the lcs is compared to the
     * longest substring found so far.
     * If the lcs is longer than the longest substring, the longest substring is
     * updated to the lcs.
     * The hash set is then cleared and the lcs is reset to an empty string.
     * 
     * @param s the input string
     * @return the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "dvdf";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}