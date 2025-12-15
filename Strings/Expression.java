import java.util.Stack;

public class Expression {

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String ReverseString(String str) {
        StringBuilder reverseStr = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr.append(str.charAt(i));
        }
        StringBuilder pureString = new StringBuilder("");
        for (int i = 0; i < reverseStr.length(); i++) {
            if (reverseStr.charAt(i) == '(') {
                pureString.append(')');
            } else if (reverseStr.charAt(i) == ')') {
                pureString.append('(');
            } else {
                pureString.append(reverseStr.charAt(i));
            }
        }
        return pureString.toString();
    }

    public static String PrefixExpression(String str) {
        String reveString = ReverseString(str);

        String revesePrefix = PostfixExpression(reveString);

        return ReverseString(revesePrefix);
    }

    public static String PostfixExpression(String str) {

        StringBuilder postfix = new StringBuilder("");

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.add(str.charAt(i));
            } else if (Character.isLetterOrDigit(str.charAt(i))) {
                postfix.append(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(str.charAt(i)) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }

                stack.add(str.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        String str = "3+2*(4+1)*5";
        System.out.println(PostfixExpression(str));
        System.out.println(PrefixExpression(str));

    }
}