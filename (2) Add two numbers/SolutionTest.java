
public class SolutionTest {
    public static void main(String[] args) {
        SolutionTest solutionTest = new SolutionTest();
        solutionTest.testAddTwoNumbers();
    }

    public void testAddTwoNumbers() {
        // Create l1 = 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create l2 = 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Check that the result is 7 -> 0 -> 8
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + ",");
            curr = curr.next;
        }

        // assert(result.equals(expected));

    }
}