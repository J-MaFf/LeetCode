
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
        while (l1 != null && l2 != null) { // While l1 and l2 have more nodes

            // Numbers are in reverse
            digitSum = l1.val + l2.val + carry;
            carry = 0;
            if (digitSum > 9){
                // Must carry over to next node
                carry =  digitSum / 10; // int devision
                digitSum = digitSum % 10; // modulo
            }

            if (l1.next != null) {
                
            }
            nextNode = new ListNode();
            current.val = digitSum;
            current.next = nextNode;
            l1 = l1.next; // Advance nodes
            l2 = l2.next;
            if (l1 != null && l2 != null) {
            current = nextNode;
            }
        }


        while (l1 != null) {
            addSingleNode(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            addSingleNode(l2.val);
            l2 = l2.next;
        }

        return sum;

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