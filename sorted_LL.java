// Java program to remove duplicates from a sorted linked list
class sorted_LL
{
    Node head; // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void removeDuplicates()
    {
        /*Another reference to head*/
        Node current = head;

        /* Pointer to store the next pointer of a node to be deleted*/
        Node next_next;

        /* do nothing if the list is empty */
        if (head == null)
            return;

        /* Traverse list till the last node */
        while (current.next != null) {

            /*Compare current node with the next node */
            if (current.data == current.next.data) {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            }
            else // advance if no deletion
                current = current.next;
        }
    }

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removal of elements");
        llist.printList();
    }
}
/* This code is contributed by Rajat Mishra

METHOD 2 (Use Sorting)
In general, Merge Sort is the best-suited sorting algorithm for sorting linked lists efficiently.
1) Sort the elements using Merge Sort. We will soon be writing a post about sorting a linked list. O(nLogn)
2) Remove duplicates in linear time using the algorithm for removing duplicates in sorted Linked List. O(n)

Please note that this method doesn’t preserve the original order of elements.

Time Complexity: O(nLogn)

Algorithm:
Traverse the list from the head (or start) node. While traversing, compare each node with its next node. If data of next node is same as current node then delete the next node. Before we delete a node, we need to store next pointer of the node

Implementation:
Functions other than removeDuplicates() are just to create a linked linked list and test removeDuplicates().

Output:
 Linked list before duplicate removal 11 11 11 13 13 20
 Linked list after duplicate removal 11 13 20

Time Complexity: O(n) where n is number of nodes in the given linked list.*/
