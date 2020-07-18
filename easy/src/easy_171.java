/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-18 10:32
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/excel-sheet-column-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_171 {
    public static void main(String[] args) {
        String s = "J";
        int i = titleToNumber(s);
        System.out.println(i);
    }

    public static int titleToNumber(String s) {
        String str = "0ABCDEFGHIJGKLMNOPQRSTUVWXYZ";

        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = chars.length - 1, j = 0; i >= 0; i--,j++) {
            int index = str.indexOf(chars[i]);
            sum += index * Math.pow(26,j);
        }
        return sum;
    }
}
