/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        // Confirm that nums1 is the smaller array
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        // Define search space
        int left = 0;
        int right = m;

        while (left <= right) {
            // Compute partition indicies
            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;

            // Obtain edge elements
            int maxLeftA = (partitionA - 1 < 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
            int minRightA = (partitionA >= m) ? Integer.MAX_VALUE : nums1[partitionA];
            int maxLeftB = (partitionB - 1 < 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
            int minRightB = (partitionB >= n) ? Integer.MAX_VALUE : nums2[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) { // correct partitioning
                if ((m + n) % 2 == 0) { // Even
                    // The median value is the average of the maximum value of
                    // the smaller half and the minimum value of the larger half
                    return ((double) Math.max(maxLeftA, maxLeftB) + (double) Math.min(minRightA, minRightB)) / 2;
                } else { // Odd
                    // the median value is the maximum value of the smaller half
                    return Math.max(maxLeftA, maxLeftB);
                }
            }
            // Compare and recalculate
            else if (maxLeftA > minRightB) { // maxLeftA is too large to be in the smaller half
                right = partitionA - 1; // move to the left half of the search space
            } else { // too far on the left side for partitionA
                left = partitionA + 1; // go to the right half of the search space
            }
        }
        return 0.0;
    } // end of method
}