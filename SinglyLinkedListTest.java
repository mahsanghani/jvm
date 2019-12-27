/**
 * Java program to test code of reversing singly linked list in Java.
 * This test class test both iterative and recursive solution. Since
 * the same list is first reversed using loops, and then again using recursion.
 * You can see that final output is same as original linked list.

 * @author Javin Paul
 */
public class SinglyLinkedListTest {

    public static void main(String args[]) {
        SinglyLinkedList linkedlist = getDefaultList();
        System.out.println("linked list before reversing : " + linkedlist);
        linkedlist.reverseIteratively();
        System.out.println("linked list after reversing : " + linkedlist);
        linkedlist.reverseRecursively();
        System.out.println("linked list after reversing recursively: " + linkedlist);

    }

    private static SinglyLinkedList getDefaultList(){
        SinglyLinkedList linkedlist = new SinglyLinkedList();
        linkedlist.append("A"); linkedlist.append("B"); linkedlist.append("C");
        linkedlist.append("D"); linkedlist.append("E"); linkedlist.append("F");
        return linkedlist;
    }

}