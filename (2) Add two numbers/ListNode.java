
 public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    static ListNode current = new ListNode(0);
    static ListNode sum = current; // sum is the head of the list
    static ListNode nextNode;
    static int digitSum;
    static int carry;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode sum = current; // sum is the head of the list
        ListNode nextNode;
        int digitSum;
        int carry;
        while (l1 != null && l2 != null) { // While l1 and l2 have more nodes

            // Numbers are in reverse
            digitSum = l1.val + l2.val + current.val;
            carry = 0;
            if (digitSum > 9){
                // Must carry over to next node
                carry =  digitSum / 10; // int devision
                digitSum = digitSum % 10; // modulo
            }
            nextNode = new ListNode(carry);
            current = new ListNode(digitSum, nextNode); 
            current = nextNode;
            l1 = l1.next; // Advance nodes
            l2 = l2.next;
        }

        while (l1 != null) {
            addSingleNode(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            addSingleNode(l2.val);
            l2 = l2.next;
        }
        ListNode reverseSum = sum;
        // Reverse sum calculated, print
        System.out.print("[");
        while (sum != null) {
            System.err.print(sum.val + ",");
            sum = sum.next;
        }
        System.out.print("]");

        return reverseSum;

    }

    public static void addSingleNode(int val){
            digitSum = val + current.val;
            carry = 0;
            if (digitSum > 9) {
                // Must carry over to next node
                carry =  digitSum / 10; // int devision
                digitSum = digitSum % 10; // modulo
            }
            nextNode = new ListNode(carry); 
            current = new ListNode(digitSum, nextNode);
            current = nextNode;   
    }
}