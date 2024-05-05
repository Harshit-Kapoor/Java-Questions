package LinkedList;


/*

class DeleteNodeDoublyLinkedList
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        Node d = head;
        while(x>1){
            d = d.next;
            x--;
        }
        Node dm1 = d.prev;
        Node dp1 = d.next;
        if(dm1 == null){
            //head node
            head = head.next;
            head.prev = null;
            return head;
        } else if(dp1 == null){
            //tail node
            dm1.next = null;
            d.prev = null;

        } else {
            dm1.next = dp1;
            dp1.prev = dm1;
            d.next = null;
            d.prev = null;
        }
        return head;
    }
}

*/

