public class MergeTwoSortedLists {
    /*
            You are given the heads of two sorted linked lists list1 and list2.

        Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list.

        Example 1:

            Input: list1 = [1,2,4], list2 = [1,3,4]
            Output: [1,1,2,3,4,4]

        Example 2:

            Input: list1 = [], list2 = []
            Output: []

        Example 3:

            Input: list1 = [], list2 = [0]
            Output: [0]

     */
 public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {
    }

    // Iterative approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode head = temp;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = (list1 == null) ? list2 : list1;
        return head.next;
    }

    //Recursive approach
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
     if (list1 == null || list2 == null) {
         return (list1 != null) ? list1 : list2;
     }

     if(list1.val > list2.val) {
         ListNode temp = list1;
         list1 = list2;
         list2 = temp;
     }
     list1.next = mergeTwoLists2(list1.next, list2);
     return list1;
    }
}
