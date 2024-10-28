public class RemoveDuplicatesFromSortedList {
    /*
    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

    Example 1:
        Input: head = [1,1,2]
        Output: [1,2]

    Example 2:
        Input: head = [1,1,2,3,3]
        Output: [1,2,3]

        Definition for singly-linked list.
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

     */

    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode removeDuplicates(ListNode head) {
        ListNode tmp = head;

        while(head != null && head.next != null) {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return tmp;
    }
}
