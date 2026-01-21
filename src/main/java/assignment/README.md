# Lab practice 3

--------
## Task 0: Singly Linked Lists

In the folder `src/main/java/resources/Lists` you can find the implementations of the data structure singly linked lists from the second lecture.
Study the code to understand how the nodes and the  insert and remove operations are implemented. 
You can find an example on how you use the insert method for inserting an element in `src/main/java/main.java`.


## Task 1:  Doubly Linked Lists

In the folder (`src/main/java/assignment/LinkedList`), you find the classes 
- _DLinkedList_ a simple and incomplete implementation of the data structure doubly linked list.
- _DLLNode_ is a class for handling the nodes in _DLinkedList_

### exercise01 - insert a new element in Doubly Linked lists

In DLinkedList.java implement the following method:

- _insertNode(ListNode nNode, ListNode pAfter)_ 
  inserts the node _nNode_ after node _pAfter_ in the current list.
- Hint: handle the case with care where _pAfter_ is the tail of the list (the last element), and _nNode_ becomes the new _tail_ 

- Extra: implement the case where you insert an element at the beginning of the list.

### exercise02 - remove an element from the  Doubly Linked lists

In DLinkedList.java implement the following method:

- _removeNode(ListNode nNode)_
  removes node _nNode_ from current list.
- Hint: handle the cases with care where _nNode_ is either the tail of the head of the list.

### Extra practice:

Implement circular doubly linked list together with insert and remove methods.

--------

## Task 2:  Stack

In the folder (`src/main/java/assignment/Stacks`), you find the class

- _SArray_ which implements interface _Stack_ but misses the correct implementation of _push()_ and _pop()_.

### exercise03 - implement  _push()_ and _pop()_ 

- find the commented lines in _SArray_ and implement those operations correctly.

### exercise04 (revised) - use _push()_ and _pop()_ for reserving an SArray

- In class _ReversedStack_ complete the method _returnInReverse(SArray a)_ by using _push()_ and _pop()_ in order to return of copy of the input array in reversed order.

--------

## Extra task: evaluating expressions 

### exercise05 - algorithm for checking code using Stack 

- Use the implemented _push()_ and _pop()_ operations in SArray for implementing an algorithm that checks if a String with java code has a correct setting of brackets

- you may use the class _CorrectlySetBrackets_ and method _isCorrectExpression(String exp)_.

- in _main()_ you will find two examples for testing of that method.

### Hints and stuff

- Hint: you may already find code for invoking the methods in the compact class _main.java_.  More information on compact class in java25 here: https://openjdk.org/jeps/512

- NOT YET IMPLEMENTED: To test your code, you will find the test setup in the file `src/test/java/assignment/TestAssignment.java`. There you can choose to run all tests at once or run them one by one. This requires that maven JUNIT 6 is installed: https://www.jetbrains.com/help/idea/junit.html

- Solution: You can find a solution proposal i the `src/main/java/solution` folder.
