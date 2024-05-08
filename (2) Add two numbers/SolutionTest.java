
public class SolutionTest {
    public static void main(String[] args) {
        SolutionTest solutionTest = new SolutionTest();
        solutionTest.testAddTwoNumbers();
    }

    public void testAddTwoNumbers() {
        // Test case 1
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode result = new Solution().addTwoNumbers(l1, l2);

        if (expected.val == result.val && expected.next.val == result.next.val && expected.next.next.val == result.next.next.val) {
            System.out.println("Test case 1 passed");
        } else {
            System.out.println("Test case 1 failed");

            System.out.print("Expected: ");
            for (ListNode node = expected; node != null; node = node.next) {
                System.out.print(node.val);
            }
            System.out.print("\nResult: ");
            for (ListNode node = result; node != null; node = node.next) {
                System.out.print(node.val);
            }
            System.out.println();
        }

        // Test case 2
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        expected = new ListNode(0);
        result = new Solution().addTwoNumbers(l1, l2);

        if (expected.val == result.val) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test case 2 failed");
            System.out.print("Expected: " + expected.val + "\t" + "Result: " );
            for (ListNode node = result; node != null; node = node.next) {
                System.out.print(node.val);
            }
            System.out.println();
        }

        // Test case 3
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        result = new Solution().addTwoNumbers(l1, l2);

        while (expected != null && result != null) {
            if (expected.val != result.val) {
                System.out.println("Test case 3 failed");
                System.out.print("Expected: " + expected.val + "\t" + "Result: " + result.val);
                return;
            }
            expected = expected.next;
            result = result.next;
        }
        
        if (expected != null || result != null) {
            System.out.println("Test case 3 failed");
            System.out.print("Lists have different lengths");
        } else {
            System.out.println("Test case 3 passed");
        }

    }
}