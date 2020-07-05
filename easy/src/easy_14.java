import java.util.ArrayList;
import java.util.HashSet;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-04 23:04
 **/
/*
    编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1:
输入: ["flower","flow","flight"]
输出: "fl"
示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:
所有输入只包含小写字母 a-z 。
 */
public class easy_14 {
    public static void main(String[] args) {
        String[] strs = {"aca","cba"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    /*
        1.先找出字符串数组中，长度最短字符串的长度。
        2.用for循环将每一个字符存入字符Set集合中。
          如果集合的长度为1，则代表这个字符在所有的字符串中都存在。
          长度不为1，则有多个情况。一直循环到某个字符在集合中的长度不为1为止，并记录长度。。
        3.将记录下相同字符的长度，从第一个字符取出。substring(0,index);
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        // 1.先找出字符串数组中，长度最短字符串的长度。
        int min = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        // 2.用for循环将每一个字符存入字符Set集合中。
        //    如果集合的长度为1，则代表这个字符在所有的字符串中都存在。
        //    长度不为1，则有多个情况。一直循环到某个字符在集合中的长度不为1为止，并记录长度。。
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>(10);
        int count = 0; // count用来标记公共字符的长度
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length; j++) {
                set.add(strs[j].charAt(i));
            }
            if (set.size() == 1) {
                count++;
                list.add(strs[0].charAt(i));
            }
            // 检查list的第一个索引处有没有值，没有直接返回空字符串结束。
            if (i == 0 && list.size() == 0) {
                return "";
            }
            // 检查完每一个字符后，都要清空字符集合。
            set.clear();
        }

        // 返回公共前缀字符串
        return strs[0].substring(0,count);
    }
}
