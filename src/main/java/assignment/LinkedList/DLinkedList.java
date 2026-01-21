/*
 *  
 *  Class doubly linked list   
 *
 */

package assignment.LinkedList;

public class DLinkedList {

    DLLNode head;
    DLLNode tail;

    public DLLNode getHead() {
        return head;
    }

    public void setHead(DLLNode firstNode) {
        this.head = firstNode;
    }

    public DLLNode getTail() {
        return tail;
    }

    public void setTail(DLLNode lastNode) {
        this.tail = lastNode;
    }

    // Appends a node to the end of the list
    public void appendNode(DLLNode nNode) {
        this.insertNode(nNode, tail);
    }

    // Task 1.1.: Insert a node into the list after pAfter
    public void insertNode(DLLNode nNode, DLLNode pAfter) {
        /*....
        *
        * Write your code here
        *
         */
    }

    // Task 1.2 : Remove the specified node from the list
    public void removeNode(DLLNode nNode) {
        /*....
         *
         * Write your code here
         *
         */
    }

    // print the content of the list
    public void print() {
        DLLNode nNode = null;
        IO.print("Current list: ");
        for (nNode = this.getHead(); nNode != null; nNode = nNode.getNext()) {
            IO.print(nNode.getData() + " ");
        }
        IO.println("");
    }

}