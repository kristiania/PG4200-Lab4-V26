/*
 *  
 *  Class singly linked list
 *
 */

package resources.Lists;

public class SLinkedList {

    SLLNode head;
    SLLNode tail;

    public SLLNode getHead() {
        return head;
    }

    public void setHead(SLLNode firstNode) {
        this.head = firstNode;
    }

    public SLLNode getTail() {
        return tail;
    }

    public void setTail(SLLNode lastNode) {
        this.tail = lastNode;
    }

    // Appends a node to the end of the list
    public void appendNode(SLLNode nNode) {
        this.insertNode(nNode, tail);
    }

    // Inserts a node into the list after pAfter
    // B -> C , new node E after B
    //result B -> E -> C
    public void insertNode(SLLNode nNode, SLLNode pAfter) {


        // set E -> C . In case B is tail : E points to NULL
        nNode.setNext(pAfter.getNext());

        // IF B is tail: Set E as new tail
        if(pAfter.equals(getTail())) {
            this.setTail(nNode);
        }
        // set B -> E         
        pAfter.setNext(nNode);
    }

    // print the content of the list
    public void print() {
        SLLNode nNode = null;
        IO.print("Current list: ");
        for (nNode = this.getHead(); nNode != null; nNode = nNode.getNext()) {
            IO.print(nNode.getData() + " ");
        }
        IO.println("");
    }

}