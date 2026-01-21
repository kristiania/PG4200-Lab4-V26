/*
 *  
 *  Class doubly linked list   
 *
 */

package resources.Lists;

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

    // Inserts a node into the list after pAfter
    public void insertNode(DLLNode nNode, DLLNode pAfter) {
        nNode.setNext(pAfter.getNext());
        nNode.setPrevious(pAfter);
        if(!pAfter.equals(getTail())) {
            nNode.getNext().setPrevious(nNode);
        }
        else{
            this.setTail(nNode);
        }
        pAfter.setNext(nNode);
    }

    // Removes the specified node from the list
    public void removeNode(DLLNode nNode) {

        if(nNode.equals(this.head) ) {
              nNode.getNext().setPrevious(nNode.getPrevious());
              this.setHead(nNode.getNext());
        }
        else if(nNode.equals(this.tail) ){
            nNode.getPrevious().setNext(nNode.getNext());
            this.setTail(nNode.getPrevious());
        }
        else {
            nNode.getNext().setPrevious(nNode.getPrevious());
            nNode.getPrevious().setNext(nNode.getNext());
        }
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