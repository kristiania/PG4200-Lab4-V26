package assignment;

import assignment.LinkedList.DLLNode;
import assignment.LinkedList.DLinkedList;
import assignment.ArrayStacks.SArray;
import assignment.ArrayStacks.CorrectlySetBrackets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignment Title")
public class TestAssignment extends BaseAssignment {
    @DisplayName("Assignment Task #01 DLL - exercise01 ")
    @Order(1)
    @Test()
    public void exercise01() {
        DLLNode nNode = new DLLNode();
        nNode.setData(3);
        DLinkedList list = new DLinkedList();
        list.setHead(nNode);
        list.setTail(nNode);

        ArrayList<Integer> testAn = new ArrayList<>();
        testAn.add(3);

        // add items to linked list
        for (int i = 2; i < 11; i++) {
            nNode = new DLLNode();
            nNode.setData(i * 2);
            list.appendNode(nNode);
            testAn.add(i * 2);
        }


        nNode = list.getHead();
        for (int i = 0; i < 10; i++) {

            int j = testAn.get(i);
            int k = nNode.getData();
            assertEquals(testAn.get(i), nNode.getData(), "Wrong data. Insert in DLL not correctly implemented.");
            nNode = nNode.getNext();
        }


    }

    @DisplayName("Assignment Task #01 DLL - exercise02")
    @Order(1)
    @Test()
    public void exercise02() {


        DLLNode nNode = new DLLNode();
        nNode.setData(3);
        DLinkedList list = new DLinkedList();
        list.setHead(nNode);
        list.setTail(nNode);

        ArrayList<Integer> testAn = new ArrayList<>();
        testAn.add(3);

        // add items to linked list
        for (int i = 2; i < 11; i++) {
            nNode = new DLLNode();
            DLLNode tail = new DLLNode();
            tail = list.getTail();
            nNode.setData(i * 2);
            testAn.add(i * 2);
            nNode.setPrevious(tail);
            list.setTail(nNode);
            tail.setNext(nNode);
        }
        // remove items from linked list
        list.removeNode(list.getHead());
        list.removeNode(list.getHead());
        list.removeNode(list.getTail());

        testAn.remove(9);
        testAn.remove(0);
        testAn.remove(0);

        nNode = list.getHead();
        for (int i = 0; i < 7; i++) {

            int j = testAn.get(i);
            int k = nNode.getData();
            assertEquals(testAn.get(i), nNode.getData(), "Wrong data. Remove in DLL not correctly implemented.");
            nNode = nNode.getNext();
        }


    }

    @DisplayName("Assignment Task #02 STACK - exercise03")
    @Order(1)
    @Test()
    public void exercise03() {
        SArray S = new SArray(3);
        S.push(1);
        S.push(4);
        S.push(5);
        assertEquals(5, S.top(), "Wrong data. push in stack not correctly implemented.");
        S.pop();
        assertEquals(4, S.top(), "Wrong data. pop in stack not correctly implemented.");

    }

    @DisplayName("Assignment Task #02 STACK - exercise04")
    @Order(1)
    @Test()
    public void exercise04() {
        SArray as = new SArray(3);
        as.push(1);
        as.push(4);
        as.push(5);

        as = as.returnInReverse();

        assertEquals(1, as.top(), "Wrong data. reversed stack not correctly implemented.");
        as.pop();
        assertEquals(4, as.top(), "Wrong data. reversed stack not correctly implemented.");
        as.pop();
        assertEquals(5, as.top(), "Wrong data. reversed stack not correctly implemented.");


    }

    @DisplayName("Assignment Extra Task  CorrectlySetBrackets - exercise05")
    @Order(1)
    @Test()
    public void exercise05() {
        CorrectlySetBrackets b = new CorrectlySetBrackets();
        String nm = "void main{if(true){IO.println(hurray)}(duh)}";
        assertTrue(b.isCorrectExpression(nm), "CorrectlySetBrackets is not correctly implemented: does not identify correct expression.");
        nm = "void main{if(false){IO.println(the next symbol is causing false]}(duh)}";
        assertTrue(!b.isCorrectExpression(nm), "CorrectlySetBrackets is not correctly implemented: does not identify correct expression.");

        /* This test may be too difficult! special case if too few opening paratheses..
        *nm = "void main{if(true)IO.println(hurray)}(duh)}";
        *assertTrue(!b.isCorrectExpression(nm), "CorrectlySetBrackets is not correctly implemented: does not identify correct expression.");
        */

    }
}
