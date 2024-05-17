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
        ListNode dummyHead, p1, p2, current;
        dummyHead = new ListNode();
        current = dummyHead;
        p1 = l1;
        p2 = l2;
        int carry = 0;

        while (p1 != null || p2 != null) {
            int val1 = (p1 != null) ? p1.val : 0;
            int val2 = (p2 != null) ? p2.val : 0;
            int sum = val1 + val2 + carry;

            carry = sum / 10; // int division
            current.next = new ListNode(sum % 10);
            current = current.next;
            p1 = (p1 != null && p1.next != null) ? p1.next : null;
            p2 = (p2 != null && p2.next != null) ? p2.next : null;

        }
        return dummyHead;
    }

    public static void main(String[] args) {
        // Test case 9999999 + 9999
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        Solution s = new Solution();
        ListNode result = s.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}