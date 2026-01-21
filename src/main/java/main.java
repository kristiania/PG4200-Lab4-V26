import assignment.LinkedList.DLLNode;
import assignment.LinkedList.DLinkedList;
import resources.Lists.SLLNode;
import resources.Lists.SLinkedList;
import assignment.ArrayStacks.CorrectlySetBrackets;

void main() {

    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task zero: insert in singly linked lists");
    IO.println();
    SLLNode sNode = new SLLNode();
    sNode.setData(1);
    SLinkedList sList = new SLinkedList();
    sList.setHead(sNode);
    sList.setTail(sNode);

    // add items to linked list
    for (int i = 2; i < 11; i++) {
        sNode = new SLLNode();
        sNode.setData(i);
        sList.appendNode(sNode);
    }

    IO.println();

    // print the content of the list
    sList.print();

    // add new element  to linked list after node with element 5
    SLLNode tmpNode = sList.getHead();
    int target = 5;
    SLLNode myNode = new SLLNode();
    myNode.setData(1000);

    for (int i = 1; i < 10; i++) {
           if(tmpNode.getData() == target){
               sList.insertNode(myNode,tmpNode);
           }
           tmpNode = tmpNode.getNext();
    }

      IO.println();                                
                                                   
      // print the content of the list             
      sList.print();                                
                                                   


    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task one: insert and remove on doubly linked lists");
    IO.println();
    DLLNode nNode = new DLLNode();
    nNode.setData(1);
    DLinkedList list = new DLinkedList();
    list.setHead(nNode);
    list.setTail(nNode);

    // add items to linked list
    for (int i = 2; i < 11; i++) {
        nNode = new DLLNode();
        nNode.setData(i);
        list.appendNode(nNode);
    }

    IO.println();

    // print the content of the list
    list.print();

    IO.println("items removed:");

    // remove items from linked list
    list.removeNode(list.getHead());
    list.removeNode(list.getHead());
    list.removeNode(list.getTail());

    // print the content of the list
    list.print();

    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task 2.1: implement push() and pop() on ArrayStack");
    IO.println();

    /* THIS code part throws StackEmptyException if push is not implemented yet.
    ArrayStack S = new ArrayStack(3);
    S.push(1);
    S.push(4);
    S.push(5);
    IO.println(S.top());
    S.pop();
    IO.println(S.top());
    S.pop();
    IO.println(S.top());
    */


    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Task 2.2: implement method ReversedArray.returnInReverse(Integer[] a)");
    IO.println();

    /* THIS code part throws StackEmptyException if push is not implemented yet.
    ArrayStack as = new ArrayStack(3);
    as.push(1);
    as.push(4);
    as.push(5);

    as = as.returnInReverse();

    ArrayStack asTest = new ArrayStack(3);
    asTest.push(1);
    asTest.push(4);
    asTest.push(5);

    IO.println();
    IO.println("If you implemented Task 2.1 and 2.2 correctly, you get the numbers in reverse order:");
    IO.println();
    IO.print(asTest.top());
    asTest.pop();
    IO.print(asTest.top());
    asTest.pop();
    IO.print(asTest.top());
    IO.println();
    IO.print(as.top());
    as.pop();
    IO.print(as.top());
    as.pop();
    IO.print(as.top());
    */





    IO.println();
    IO.println("------------------------------------------------------------------------");
    IO.println();
    IO.println("Extra task : check String with java code for correct setting of brackets");
    IO.println();

    CorrectlySetBrackets b = new CorrectlySetBrackets();
    String nm = "void main{if(true){IO.println(hurray)}(duh)}";
    IO.println(nm);
    boolean result = b.isCorrectExpression(nm);
    IO.println("RESULT: " + result);
    if (result) IO.println("This java code has correctly set brackets.");
    else IO.println("Try again. This java code DOES HAVE correctly set brackets.");
    IO.println();
    nm = "void main{if(x==0){brag(int ])}";
    IO.println(nm);
    result = b.isCorrectExpression(nm);
    IO.println("RESULT: " + result);
    if (result) IO.println("Try again. This java code DOES NOT HAVE correctly set brackets.");
    else IO.println("This java code has NOT correctly set brackets.");

}