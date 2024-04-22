package LinkedList;



class Node
{
	int data;
	Node next;

	Node(int d)
	{
		data = d;
		next = null;
	}
}
class DeleteNode {
    Node deleteNode(Node head, int x)
    {
        Node temp = head;

        if (x == 1) {
            Node tempP1 = temp.next;
            //temp.next = null;
            return tempP1;
        }

        for(int i=1; i<x-1; i++) {
            temp = temp.next;
        }

        Node tempP1 = temp.next.next;
        temp.next = null;
        temp.next = tempP1;

        return head;

    }
}


/* Delete if u are given specific node

    Change value of current node with next node, and remove next node

    public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
    }

 */