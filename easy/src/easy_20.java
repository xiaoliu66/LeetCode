import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/12 15:29
 * @version 1.0
 * 有效的括号
 */
public class easy_20 {

    public static void main(String[] args) {
        boolean valid = isValid("(}{)");
        System.out.println(valid);
        /*System.out.println(0 + '{');
        System.out.println(0 + '}');
        System.out.println(0 + '[');
        System.out.println(0 + ']');
        System.out.println(0 + '(');
        System.out.println(0 + ')');*/


    }

    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
