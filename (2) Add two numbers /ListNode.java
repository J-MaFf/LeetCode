
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
        // Find how many digits first num is
        int digits = 0;
        ListNode curr = l1;
        while (curr.next != null) {
            digits++;
            curr = curr.next;
        }
    }
}