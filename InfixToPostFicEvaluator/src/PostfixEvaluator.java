//Lauren Helena Brampton
//9/11/2024
//Class Definition: Evaluates postfix ecpressions and returns the result
//uses a stack to calculate the final result
import java.util.Stack;

public class PostfixEvaluator
{
    //this method evaluates a postfix expression and reutrns result
    public static int evaluatePostFix(String postfix)
    {
        //a stack is used to keep track of operands
        Stack<Integer> stack = new Stack<>();

        //go through each char in the postfix
        for(int i = 0; i < postfix.length(); i++)
        {
            //get the current char
            char c = postfix.charAt(i);

            //if char is didget, convert to int and push it onto the stack
            if(Character.isDigit(c))
            {
                //convert char to int by sub 0 to get its in value
                stack.push(c - '0');
                //this works on ASCII^^^
            }
            //if character is an operator
            else if (c == '+' || c == '-' || c == '*' || c == '/')
            {
                //pop the two topmost elements from the stack
                int b = stack.pop(); //second operand
                int a = stack.pop();// first opperand

                //var to store result
                int result = 0;

                //perform operation based on opperator
                switch(c)
                {
                    case '+':
                        result = a + b;
                        break;
                        case '-':
                            result = a - b;
                            break;
                            case '*':
                                result = a * b;
                                break;
                    case '/':
                        result = a / b;
                        break;
                }
                //push result onto stack
                stack.push(result);
            }
        }
        //the result will be the only thing left in stack
        return stack.pop();
    }
}
