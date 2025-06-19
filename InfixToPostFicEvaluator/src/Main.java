//Lauren Helena Brampton
//9/11/2024
//Class Definition: to print out the results,
//used to test all classes are in working order.
public class Main
{
    public static void main(String[] args)
    {
        //define the infix expression that we want to convert and evaluate
        String infixExpression = "(2 - 3 + 4) * (5 + 6 * 7)";

        //concert the infix expression to postfix using the InfixToPostfix class convertToPostfix method
        String postfixExp = InfixToPostfix.convertToPostfix(infixExpression);

        //print ou thte converted profix expression
        System.out.println("Postfix: " + postfixExp);

        //evaluate the postfix expression using the PsotfixEvaluator class evaluatePostFix method
        int result = PostfixEvaluator.evaluatePostFix(postfixExp);

        //print the resullt
        System.out.println("Result: " + result);

        //testing again
        //define the infix expression that we want to convert and evaluate
        infixExpression = "53+62/*35*+";

        //concert the infix expression to postfix using the InfixToPostfix class convertToPostfix method
        postfixExp = InfixToPostfix.convertToPostfix(infixExpression);

        //print ou thte converted profix expression
        System.out.println("Postfix: " + postfixExp);

        //evaluate the postfix expression using the PsotfixEvaluator class evaluatePostFix method
        result = PostfixEvaluator.evaluatePostFix(postfixExp);

        //print the resullt
        System.out.println("Result: " + result);

        //testing again
        //define the infix expression that we want to convert and evaluate
        infixExpression = "3 4 * 2 5 * +";

        //concert the infix expression to postfix using the InfixToPostfix class convertToPostfix method
        postfixExp = InfixToPostfix.convertToPostfix(infixExpression);

        //print ou thte converted profix expression
        System.out.println("Postfix: " + postfixExp);

        //evaluate the postfix expression using the PsotfixEvaluator class evaluatePostFix method
        result = PostfixEvaluator.evaluatePostFix(postfixExp);

        //print the resullt
        System.out.println("Result: " + result);
    }
}