package Linked_List;


// lettcode: 2095 - 75 challange
// Input: head = [1,3,4,7,1,2,6]
// Output: [1,3,4,1,2,6]

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class DeleteMiddleNode {
    public static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) 
            return null;
        
        ListNode slow = head, fast = head.next.next;
        while(fast != null && fast.next != null) {  
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
