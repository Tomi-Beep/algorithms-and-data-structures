import java.util.Stack;
import java.util.Scanner;

public class ExpressionEvaluator {

    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = expression.toCharArray();
        int currentNumber = 0;
        char currentOperation = '+';

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && currentChar != ' ' || i == chars.length - 1) {
                if (currentOperation == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (currentOperation == '+') {
                    stack.push(currentNumber);
                }
                currentOperation = currentChar;
                currentNumber = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String izraz = sc.nextLine();
        int result = evaluateExpression(izraz);
        System.out.println(result);
    }
}
