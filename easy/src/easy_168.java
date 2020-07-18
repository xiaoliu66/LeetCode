/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-18 10:01
 *
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/excel-sheet-column-title
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_168 {
    public static void main(String[] args) {
        String s = convertToTitle(26);
        System.out.println(s);
    }
    // 这道题的本质是10进制转换为26进制。
    /*
        都是取每次n%26之后的数，如果是0要特殊处理。
        然后将n = n/26 一次循环。直到n==0。
     */
    public static String convertToTitle(int n) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder sb = new StringBuilder();
        int m = 0;
        while (true) {
            m = n % 26;
            n = n / 26;
            if (m == 0) {
                m = 26;
                n = n -1;
            }
            sb.append(arr[m-1]);
            if (n == 0) break;
        }

        return sb.reverse().toString();
    }
}
