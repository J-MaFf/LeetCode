public class test {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("babad\tExpected: bab\tResult:\t" + s.longestPalindrome("babad"));
        System.out.println("cbbd\tExpected: bb\tResult:\t" + s.longestPalindrome("cbbd"));
        System.out.println("a\tExpected: a\tResult:\t" + s.longestPalindrome("a"));
        System.out.println("ac\tExpected: a\tResult:\t" + s.longestPalindrome("ac")); // or c, since both are correct
        System.out.println("bb\tExpected: bb\tResult:\t" + s.longestPalindrome("bb"));
        System.out.println("eabcb\tExpected: bcb\tResult:\t" + s.longestPalindrome("eabcb"));

    }
}
