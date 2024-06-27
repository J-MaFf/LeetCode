/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        // Confirm that nums1 is the smaller array
        if (m > n) {
            findMedianSortedArrays(nums2, nums1);
        }
        // Define search space
        int left = 0;
        int right = m;

        while (left <= right) {
            // Compute partition indicies
            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;
        }
    }
}