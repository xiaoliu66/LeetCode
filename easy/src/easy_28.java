/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-05 22:41
 * <p>
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_28 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ll";
        //int num = strStr(s1,s2);
        int i = RearchStr(s1,s2);

        System.out.println(i);
    }

    public static int RearchStr(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    // public static int strStr(String haystack, String needle) {
    //     if (needle.length() == 0) {
    //         return 0;
    //     }
    //     // 判断haystack字符串中有没有包含needle字符串。
    //     if (haystack.contains(needle)) {
    //         int index = 0;
    //         char[] chars = needle.toCharArray();
    //         char[] chars1 = haystack.toCharArray();
    //         int left = 0, right = chars1.length - 1;
    //         for (int i = 0, j = chars1.length - 1; i <= j ; i++,j--) {
    //             if (chars[0] == chars1[i] && chars[chars.length-1] == chars1[j]) {
    //                 if (chars.length == (j-i + 1)) {
    //                     return i;
    //                 }
    //             }
    //         }
    //     }
    //     return -1;
    // }

    // private static Integer getInteger(char[] chars, char[] chars1, int left, int right) {
    //     while (left != right) {
    //         // 先从前面找到和needle中第一个字符相等的字符索引
    //         while ( chars[0] != chars1[left] && left < right) {
    //             left++;
    //         }
    //         // 再从后面找到和needle中最后一个字符相等的字符索引
    //         while ( chars[chars.length-1] != chars1[right] && left < right) {
    //             right--;
    //         }
    //
    //         if (right - left == chars.length-1) {
    //             return left;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return null;
    // }
}
