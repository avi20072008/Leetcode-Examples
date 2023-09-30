import shared.Node;

import java.util.Stack;

public class LinkedList {

    public static void main(String[] args) {

        Node n1 = new Node(4);  //first node = head
        Node n2 = new Node(8);
        Node n3 = new Node(15);

        // Since n1 is first node, its head.
        n1.next = n2;
        n2.next = n3;
        n3.next = null;

        printLinkedlist(n1);

        //Inserting a node at the beginning to LinkedList (setting new head)
        // send head and value to set.
        Node newHead = insertElement(n1, 3);
        insertElementAtEnd(newHead, 43);
        insertElementAtMiddle(newHead, 33);

        // Reverse Linked List
        Node head =  reversedLinkedList(n1);

        printLinkedlist(head);

        // Print Linked List in Reverse using Stack
        printLLElementsInReverseUsingStack();

        // Print Linked List in Reverse using Recursion
        printLLElementsUsingRecursion(n1);
    }

    private static void printLLElementsUsingRecursion(Node head) {
        // Create new linked list
        Node n1 = new Node(10);  //first node = head
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // Since n1 is first node, its head.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        System.out.println(" *****  LL Elements Printed using Recursion *****");
        reversePrintUsingRecursion(n1);

    }

    private static void reversePrintUsingRecursion(Node head) {
        if(head == null)
            return;

        //Recursive call
        reversePrintUsingRecursion(head.next);

        System.out.println(head.value);
    }

    private static void printLLElementsInReverseUsingStack() {
        // Create new linked list
        Node n1 = new Node(10);  //first node = head
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // Since n1 is first node, its head.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        //Print Linked List in reverse. We dont need to reverse the elements
        //We will use Stack as its LIFO

        Stack<Integer> stack = new Stack<>();

        Node curr = n1;

        while(curr != null){
            stack.push(curr.value);
            System.out.println(" Node value " + curr.value);
            curr = curr.next;
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    private static Node reversedLinkedList(Node n1) {

        Node prev = null;
        Node curr = n1;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    private static void insertElementAtMiddle(Node newHead, int val) {
        Node newNode = new Node(val);

        //Insert new node after the element which has value 8
        Node ptr = newHead;
        while(ptr.value != 8){
            ptr = ptr.next;
        }
        //Now we found node or element with value 8
        Node nextNode = ptr.next;
        ptr.next = newNode; // insert new node after Node with value 8
        newNode.next = nextNode;
        printLinkedlist(newHead);
    }

    private static void printLinkedlist(Node n1) {
        System.out.println(" ---- Printing Linked List -----");
        //LinkedList will be accessed only through head (first node)
        Node node = n1; // call first node as head
        while(node != null){    //until we reach last element on LL
            System.out.println(" Value " + node.value);
            node = node.next;
        }
    }

    // Insert Element at the beginning ( As a header)
    //https://www.youtube.com/watch?v=5ao9KfGga3c
    private static Node insertElement(Node head, int val) {
        //Create new node
        Node newNode = new Node(val);

        //Assign new node's next as existing head.
        newNode.next = head;

        printLinkedlist(newNode);
        return newNode;
    }

    // Insert Element at the end ( As a tail)
    private static void insertElementAtEnd(Node head, int val) {

        Node newNode = new Node(val);
        Node ptr = head;
        while(ptr.next !=null)
            ptr = ptr.next;

        //once we reach at the end, assign last node's next pointer to new node.
        ptr.next = newNode;
        //newNode.next = null;

        printLinkedlist(head);
    }
}
