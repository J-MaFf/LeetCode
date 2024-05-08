
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode sum = current; // sum is the head of the list
        ListNode nextNode;
        int digitSum;
        int carry = 0;
        ListNode reverseSum = sum;
        while (l1 != null && l2 != null) { // While l1 and l2 have more nodes

            // Numbers are in reverse
            digitSum = l1.val + l2.val + carry;
            carry = 0;
            if (digitSum > 9) {
                // Must carry over to next node
                carry = digitSum / 10; // int devision
                digitSum = digitSum % 10; // modulo
            }
            current.val = digitSum;
            if (l1.next == null && l2.next == null) {
                l1 = l1.next; // Advance nodes
                l2 = l2.next;
                break;

            }
            nextNode = new ListNode();
            current.next = nextNode;
            current = nextNode;
            l1 = l1.next; // Advance nodes
            l2 = l2.next;
        }
        while (l1 != null) {
            addSingleNode(l1, carry, current);
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            addSingleNode(l2, carry, current);
            current = current.next;
            l2 = l2.next;
        }
        return reverseSum;

    }

    public static ListNode addSingleNode(ListNode node, int carry, ListNode current) {
        int digitSum = node.val + carry;
        carry = 0;
        if (digitSum > 9) {
            // Must carry over to next node
            carry = digitSum / 10; // int devision
            digitSum = digitSum % 10; // modulo
        }
        current.val = digitSum;
        if (node.next == null) {
            if (carry > 0) {
                current.next = new ListNode(carry);
            }
            return current;
        }
        current.next = new ListNode();
        return current.next;
    }

}