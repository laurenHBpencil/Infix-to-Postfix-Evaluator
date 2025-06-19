//Lauren Helena Brampton
//9/11/2024
//Class Definition:Converts infix to a postfix
// also defines the operators importance and handles conversion using a stack
import java.util.Stack;

public class InfixToPostfix
{
    public static int getPrecedence(char ch)
    {
        //This switch case give priority of operators
        //the higher the number means higher priority
        switch (ch)
        {
            //have the same low num (1)
            case '+':
            case '-':
                return 1;
                //have the same higher num (2)
            case '*':
            case '/':
                return 2;
                //if there is no opperator, return -1
            default:
                return -1;
        }
    }

    //this method changes an infix expression into a postfix expression
    public static String convertToPostfix(String infix)
    {
        //builds the postfix result
        StringBuilder postfix = new StringBuilder();

        //statck is used to store operators and parentheses-
        //-while changing the expression
        Stack<Character> stack = new Stack<>();

        //go through each char in the input expression
        for (int i = 0; i < infix.length(); i++)
        {
            char c = infix.charAt(i);

            //skipping spaces
            if (Character.isWhitespace(c))
            {
                continue;
            }

            // If character is an operand, add it to the result
            if (Character.isLetterOrDigit(c))
            {
                postfix.append(c).append(' ');//add spaces between operands
            }
            // If ( is found, push it to stack
            else if (c == '(')
            {
                stack.push(c);
            }
            // If ) is found, pop until ( is found
            else if (c == ')')
            {
                //pop ecverything till ( is found
                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop(); //remove ( from the stack
            }
            // If an operator is found
            else
            {
                //pop opperators from stack if they have higher or equal priority-
                //-than the current one
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek()))
                {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(c); //push current operator to the stack
            }
        }

        //after going through the whole expression, pop the remaiing opperators from the stack
        while (!stack.isEmpty())
        {
            postfix.append(stack.pop()).append(' ');
        }

        //return the final postfix
        return postfix.toString();
    }
}