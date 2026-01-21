package assignment.LinkedList;/*  CSI2114 Lab 2 - ListNode.java
 *  
 *  Class node of a doubly linked list   
 *  
 *  by Jeff Souza
 *
 */

public class DLLNode {
    int data;
    DLLNode next;
    DLLNode previous;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }
}
