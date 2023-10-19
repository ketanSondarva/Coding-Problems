
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class palindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {

        ListNode newHead = head;
        // first reverse the linked list:
        
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        ListNode prev = reverse(newHead);
        
        // checkint for palindrome:
        while(newHead != null && prev != null) {
            
            if(newHead.val != prev.val) 
                return false;
            
            newHead = newHead.next;
            prev = prev.next;
        }
        
        // if(prev != null)
        return true;
        
    }

    static ListNode reverse(ListNode node) {

        ListNode prev = null;
        ListNode curr = node;
        
        while(curr != null) {
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        return prev;
    }

    static void addElement(ListNode node, int val) {
        ListNode temp = node;
        while(temp.next != null) 
            temp = temp.next;

        ListNode newNode = new ListNode(val);
        temp.next = newNode;
    }

    static void traverse(ListNode node) {
        ListNode temp = node;

        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        addElement(head, 2);
        addElement(head, 2);
        addElement(head, 1);

        traverse(head);

        System.out.println(isPalindrome(head));
    }
}