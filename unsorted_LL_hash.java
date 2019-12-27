// Java program to remove duplicates
// from unsorted linkedlist

import java.util.HashSet;

public class removeDuplicates
{
    static class node
    {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }

    /* Function to remove duplicates from a
       unsorted linked list */
    static void removeDuplicate(node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        node current = head;
        node prev = null;
        while (current != null)
        {
            int curval = current.val;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

    }

    /* Function to print nodes in a given linked list */
    static void printList(node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);
        start.next.next.next.next.next = new node(11);
        start.next.next.next.next.next.next = new node(10);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        removeDuplicate(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }
}

/*
METHOD 3 (Use Hashing)
We traverse the link list from head to end. For every newly encountered element, we check whether it is in the hash table: if yes, we remove it; otherwise we put it in the hash table.

Output :
Linked list before removing duplicates:
 10 12 11 11 12 11 10
Linked list after removing duplicates:
 10 12 11
Thanks to bearwang for suggesting this method.

Time Complexity: O(n) on average (assuming that hash table access time is O(1) on average).
 */