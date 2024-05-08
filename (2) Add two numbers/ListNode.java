
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
        ListNode reverseSum = sum;
        while (l1 != null && l2 != null) { // While l1 and l2 have more nodes

            // Numbers are in reverse
            digitSum = l1.val + l2.val + carry;
            carry = 0;
            if (digitSum > 9){
                // Must carry over to next node
                carry =  digitSum / 10; // int devision
                digitSum = digitSum % 10; // modulo
            }
            current.val = digitSum;
            if (l1.next == null && l2.next == null) {
                break;
            }
            nextNode = new ListNode();
            current.next = nextNode;
            current = nextNode;
            l1 = l1.next; // Advance nodes
            l2 = l2.next;
        }
        clearVars();
        while (l1 != null) {
            addSingleNode(l1);
            l1 = l1.next;
        }
        clearVars();
        while (l2 != null) {
            addSingleNode(l2);
            l2 = l2.next;
        }
        clearVars();
        return reverseSum;

    }

    public static void addSingleNode(ListNode node){
            digitSum = node.val + carry;
            carry = 0;
            if (digitSum > 9) {
                // Must carry over to next node
                carry =  digitSum / 10; // int devision
                digitSum = digitSum % 10; // modulo
            }
            current.val = digitSum;
            if (node.next == null) {
                return;
            }
            nextNode = new ListNode();
            current.next = nextNode;
            current = nextNode;
    }

    public static void clearVars(){
        current = new ListNode(0);
        sum = current; // sum is the head of the list
        nextNode = null;
        digitSum = 0;
        carry = 0;
    }
}