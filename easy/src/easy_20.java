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
        if (s.length() % 2 != 0) return false;

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = getAnotherChar(c1);
            // 如果括号的左右顺序不同直接返回false
            // if (c1 + 0 > c2 + 0) return false;
            int i1 = s.indexOf(c2,i);
            if (Math.abs(i1 - i) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 给定一个括号字符，返回对应的括号字符
     * @param s
     * @return
     */
    public static char getAnotherChar(char s) {
        switch (s) {
            case '{':
                return '}';

            case '}':
                return '{';

            case '[':
                return ']';

            case ']':
                return '[';

            case '(':
                return ')';

            case ')':
                return '(';

            default:
                return '0';
        }
    }
}
