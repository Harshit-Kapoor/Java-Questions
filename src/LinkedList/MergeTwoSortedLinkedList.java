package LinkedList;

class MergeTwoSortedLinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node h1, Node h2) {
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        Node ans = null , t = null;
        if(h1.data < h2.data){
            ans = h1;
            t = h1;
            h1 = h1.next;
        } else {
            ans = h2;
            t = h2;
            h2 = h2.next;
        }

        while(h1 != null && h2 != null){
            if(h1.data < h2.data){
                t.next = h1;
                t = t.next;
                h1 = h1.next;
            } else {
                t.next = h2;
                t = t.next;
                h2 = h2.next;
            }
        }
        if(h1 != null) t.next = h1;
        if(h2 != null) t.next = h2;

        return ans;
    }
}
