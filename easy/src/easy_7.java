import java.util.Scanner;

/**
 * @version : v1.0
 * @author: liu
 * @create: 2020-05-28 22:48
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = reverse(num);
        System.out.println(result);

    }
    /*
    public static int reverse(String x) {
        try {
            if (Integer.parseInt(x) >= 0) {
                StringBuilder sb = new StringBuilder(x);
                StringBuilder reverse = sb.reverse();

                int num = Integer.parseInt(reverse.toString());
                return num;
            } else {
                x = x.substring(1);
                StringBuilder sb = new StringBuilder(x);
                StringBuilder reverse = sb.reverse();

                int num = Integer.parseInt(reverse.toString());
                return (-1) * num;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }*/

    public static int reverse(int x) {
        int result = 0;
        String str = "";
        try {
            if (x >= 0) {
                str += x;
                StringBuilder sb = new StringBuilder(str);
                StringBuilder reverse = sb.reverse();
                int num = Integer.parseInt(reverse.toString());
                result = num;
            }else {
                str += x;
                str = str.substring(1);
                StringBuilder sb = new StringBuilder(str);
                StringBuilder reverse = sb.reverse();
                int num = Integer.parseInt(reverse.toString());
                result = (-1) * num;
            }
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}
