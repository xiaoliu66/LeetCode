import java.math.BigInteger;
import java.util.IllegalFormatCodePointException;
import java.util.LinkedList;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-12 19:17
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = " 1011"
 * 输出: "10101"
 * 提示：
 *
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_67 {
    public static void main(String[] args) {
        /*String s = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String s1 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";*/
        String s = "110111";
        String s1 = "101";
        String result = addBinary(s,s1);
        System.out.println(result);
    }

    public static String addBinary(String a,String b) {
        // 创建两个字符集合，并把字符串的数组添加到集合中。
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> list2 = new LinkedList<>();

        //添加数据
        for (int i = 0; i < a.length(); i++) {
            list1.add(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            list2.add(b.charAt(i));
        }

        // 找出两个字符串中最小的长度,并将短的集合前面全部补为0.
        int lena = a.length(), lenb = b.length();
        int min = Math.min(lena, lenb);

        if (lena == min) {
            int num = lenb - lena;
            for (int i = 0; i < num; i++) {
                list1.addFirst('0');
            }
        }else if (lenb == min){
            int num = lena - lenb;
            for (int i = 0; i < num; i++) {
                list2.addFirst('0');
            }
        }


        // 从两个字符的最后索引位置开始，各取每一个字符进行比较。
        int aLast = list1.size()-1, bLast = list2.size()-1;
        boolean flag = false; // 记录进位。
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list1.size(); i++) {
            char ca = list1.get(aLast-i);
            char cb = list2.get(bLast-i);
            // 对这两个字符进行比较，只有都是1的时候才执行进位操作。
            // 当两个字符这些情况时 0 0 、 0 1、 1 0、1 1
            if (ca == '0' && cb == '0') {
                // 如果两个字符都是’0‘ 并且进位为真时，运行结果是'1'。
                if (flag) {
                    sb.append('1');
                    flag = false;
                }else {
                    sb.append('0');
                }
            }else if (ca == '0' && cb == '1' ) {
                // 这两个字符的运行结果本来是'1'，但如有进位符，则是0
                if (flag) {
                    sb.append('0');
                }else {
                    sb.append('1');
                }
            }else if (ca == '1' && cb == '0') {
                // 这两个字符的运行结果本来是'1'，但如有进位符，则是0
                if (flag) {
                    sb.append('0');
                }else {
                    sb.append('1');
                }
            }else {
                // 当两个字符都是’1‘时，运行结果是'0',进位数加一。如果进位数是大于0的，则是1.
                if (flag) {
                    sb.append('1');
                }else {
                    sb.append('0');
                }
                flag = true;
            }
        }

        // 最后判断进位数的值，如果大于0，则在前面加‘1’。否则不加。
        if (flag) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    /*public static String addBinary(String a, String b) {
        BigInteger num1 = toInt(a), num2 = toInt(b), num3 = new BigInteger("2");
        BigInteger sum = num1.add(num2);
        StringBuilder sb = new StringBuilder();
        // 将十进制转换为二进制
        while (true) {
            BigInteger divide = sum.divide(num3);
            if (divide.equals("0")) {
                break;
            }
            BigInteger mod = sum.remainder(num3);
            sum = sum.divide(num3);
            sb.append(mod);
        }
        sb.append(sum);
        return sb.reverse().toString();
    }
    // 将二进制转换为十进制
    public static BigInteger toInt(String s) {
        BigInteger sum = new BigInteger("0");
        for (int i = s.length() - 1, j = 0; i >= 0; i--,j++) {
            long a = (long) (Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(2,j));
            sum.add(BigInteger.valueOf(a));
        }
        return sum;
    }*/
}
