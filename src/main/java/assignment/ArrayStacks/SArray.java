package assignment.ArrayStacks;

import resources.Stacks.Stack;
import resources.Stacks.StackEmptyException;
import resources.Stacks.StackFullException;

public class SArray implements Stack {

    public static final int CAPACITY = 1000; //# default capacity of the stack
    private int capacity;                    // maximum capacity of the stack.
    private Object S[];                       // S holds the elements of the stack
    private int top = -1;                    // the top element of the stack.
 
    public SArray() {       //# Initialize the stack with default capacity
        this(CAPACITY);
    }

    public SArray(int cap) {  //# Initialize the stack with given capacity
        capacity = cap;
        S = new Object[capacity];
    }

    public int size() {          //# Return the current stack size
        return (top + 1);
    }

    public boolean isEmpty() {   //# Return true iff the stack is empty
        return (top < 0);
    }

    public Object top() throws StackEmptyException {  //# Return the top stack element
        if (isEmpty())
            throw new StackEmptyException("Stack is empty.");
        return S[top];
    }

    public void push(Object obj) throws StackFullException {  //# Push a new object on the stack
        /*
        *
        *  Task two: implement push() on ArrayStack : Write your code here
        * 
        * 
         */
    }
    

    public Object pop() throws StackEmptyException { //# Pop off the stack element
        Object elem = null;
        /*
         *
         *  Task two: implement pop() on ArrayStack : Write your code here
         *
         *
         */
         return elem;
    }

    public SArray returnInReverse() {
        SArray rev = new SArray(size());
        /*
         *
         * Task 2.2: implement method ReversedArray.returnInReverse(Integer[] a). Write your code here.
         *
         */
        return rev;
    }


}