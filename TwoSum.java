import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        // Test 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] expected1 = { 0, 1 };
        int[] result1 = ts.twoSum(nums1, target1);
        System.out.println("Test 1 result: " + result1[0] + ", " + result1[1] + " Expected: " + expected1[0] + ", "
                + expected1[1]);

        // Test 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] expected2 = { 1, 2 };
        int[] result2 = ts.twoSum(nums2, target2);
        System.out.println("Test 2 result: " + result2[0] + ", " + result2[1] + " Expected: " + expected2[0] + ", "
                + expected2[1]);

        // Test 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] expected3 = { 0, 1 };
        int[] result3 = ts.twoSum(nums3, target3);
        System.out.println("Test 3 result: " + result3[0] + ", " + result3[1] + " Expected: " + expected3[0] + ", "
                + expected3[1]);
    }

    // Aiming for O(n) time complexity
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();

        // Populate hash table
        for (int i = 0; i < nums.length; i++) {
            table.put(nums[i], i); // (Value, Index)
        }
        // Find Two sum
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i]; // Stores the number that needs to be found for table[i]
            if (table.containsKey(compliment)) {
                return new int[] { i, table.get(compliment) };
            }
        }

        // No valid two sum found
        return null;
    }
}
