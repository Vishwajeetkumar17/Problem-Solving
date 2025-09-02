/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        Node fast = head, slow = head;
        Node temp = head;
        for(int i=1;i<k;i++){
            fast = fast.next;
            if(fast == null) return head;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        int val = slow.data;
        slow.data = temp.data;
        temp.data = val;
        return head;
    }
}
