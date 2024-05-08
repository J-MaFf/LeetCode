
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

        if (expected.val == result.val && expected.next.val == result.next.val && expected.next.next.val == result.next.next.val && expected.next.next.next.val == result.next.next.next.val && expected.next.next.next.next.val == result.next.next.next.next.val && expected.next.next.next.next.next.val == result.next.next.next.next.next.val && expected.next.next.next.next.next.next.val == result.next.next.next.next.next.next.val && expected.next.next.next.next.next.next.next.val == result.next.next.next.next.next.next.next.val) {
            System.out.println("Test case 3 passed");
        } else {
            System.out.println("Test case 3 failed");
            System.out.print("Expected: " + expected.val + "\t" + "Result: " );
            for (ListNode node = result; node != null; node = node.next) {
                System.out.print(node.val);
            }
        }

    }
}