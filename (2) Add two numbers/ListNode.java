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
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null; // Initialize l3 with null
        ListNode head = l3; // Store the head of the list
        int carry = 0;
        int totalDigits = 0;
        while (l1 != null && l2 != null) {
            l3 = new ListNode(l1.val + l2.val + carry);
            carry = 0; // Reset carry
            while (l3.val > 9) { // Since a ListNode can only store digits 0 - 9
                l3.val = l3.val - 10;
                carry++;
            }
            // l3.val is now calculated, and so is the carry.
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next; // might need to create a new node.

            totalDigits++;
        }
        while (l1 != null) {
            l3.val = l1.val + carry;
            carry = 0;
            l1 = l1.next;
            l3 = l3.next;
            totalDigits++;
        }
        while (l2 != null) {
            l3.val = l2.val + carry;
            carry = 0;
            l2 = l2.next;
            l3 = l3.next;
            totalDigits++;
        }
        ListNode curr = head;
        System.out.print("[");
        while (curr != null) {
            System.out.print(curr.val + ",");
        }
        System.out.print("]");

        return l3;
    }
}