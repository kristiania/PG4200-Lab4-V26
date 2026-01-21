package solution;

/*
 *  
 *  Class to check valid setting of brackets in java code
 *
 */

import resources.Stacks.Stack;

public class CorrectlySetBrackets {

    public boolean isCorrectExpression(String exp) {
        Stack st = new SArray();
        int i = 0;
        for (char c : exp.toCharArray()) {
            switch (c) {
                case '[':
                    st.push('[');
                    break;
                case '(':
                    st.push('(');
                    break;
                case '{':
                    st.push('{');
                    break;
                case ']':
                    // check if there are no opening brackets left..
                    // otherwise pop the stack.
                    // this should give you a matching opening bracket.
                    if (st.isEmpty() ||  ! st.pop().equals('['))
                    {
                        IO.println("Wrong bracket ']' at position " + i);
                        return false;
                    };
                    break;
                case ')':
                    if (st.isEmpty() || ! st.pop().equals('('))
                    {
                        IO.println("Wrong parentheses ')' at position " + i);
                        return false;
                    };
                    break;
                case '}':
                    if (st.isEmpty() || ! st.pop().equals('{'))
                    {
                        IO.println("Wrong brace '}' at position " + i);
                        return false;
                    };
                    break;
                default:
                    // arbitrary char -- do nothing
            }
            i++;
        }
        return true;

    }

}