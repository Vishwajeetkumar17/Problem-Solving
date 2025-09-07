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
    Node mergeKLists(Node[] arr) {
        // code here
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Node curr = arr[i];
            while(curr != null){
                ls.add(curr.data);
                curr = curr.next;
            }
        }
        Collections.sort(ls);
        Node ans = new Node(ls.get(0));
        Node temp = ans;
        for(int i=1;i<ls.size();i++){
            temp.next = new Node(ls.get(i));
            temp = temp.next;
        }
        return ans;
    }
}