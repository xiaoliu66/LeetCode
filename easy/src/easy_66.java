import javax.naming.Binding;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-12 17:48
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_66 {
    public static void main(String[] args) {
        int[] arr = {5,6,2,0,0,4,6,2,4,9};
        int[] ints = plusOne(arr);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        int[] temp;
        if (digits[last] == 9) {
            StringBuilder sb = new StringBuilder();
            for (int digit : digits) {
                sb.append(digit);
            }
            String s = sb.toString();
            if (digits[0] < 9) {
                temp = new int[s.length()];
            }else {
                temp = new int[s.length()+1];
            }

            BigInteger a = new BigInteger(s);
            BigInteger b = new BigInteger("1");
            BigInteger add = a.add(b);

            s = add.toString();
            for (int i = 0; i < s.length(); i++) {
                temp[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }

            return temp;
        }
        digits[last] = digits[last] + 1;
        return digits;
    }
}
