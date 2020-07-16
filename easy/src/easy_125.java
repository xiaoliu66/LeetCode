/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-16 13:57
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_125 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        // 先把字符串转换成字符数组。
        char[] chars = s.toCharArray();
        // 判断数组中的每个字符是否是数字或字母，如果满足就加入。
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char chs = chars[i];
            if (chs >= 'a' && chs <= 'z' ) {
                sb.append(chs);
            }else if (chs >= 'A' && chs <= 'Z') {
                sb.append(chs);
            }else if (chs >= '0' && chs <= '9') {
                sb.append(chs);
            }
        }

        String s1 = sb.toString();
        String s2 = sb.reverse().toString();

        if (s1.equalsIgnoreCase(s2)) {
            return true;
        }
        return false;
    }
}
