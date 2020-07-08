import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-08 15:28
 **/
public class easy_38 {
    public static void main(String[] args) {
        countAndSay(30);
    }

    public static void countAndSay(int n) {
        String[] str = new String[30];
        LinkedHashMap<Character,Integer> set = new LinkedHashMap();

        str[0] = String.valueOf(1);
        str[1] = String.valueOf(11);
        for (int i = 2; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String temp = str[i-1];
            char[] chars = temp.toCharArray();
            int count = 0;

            for (int j = 0; j < chars.length; j++) {
                if (!set.containsKey(chars[j])) {
                    set.put(chars[j],1);
                }else {
                    // 如果当前字符和前一个字符不相等，就将前面的添加到字符串中，并清空集合，也要清空计数器。
                    if (j > 1 && chars[j] != chars[j-1]) {
                        Set<Map.Entry<Character, Integer>> entries = set.entrySet();
                        for (Map.Entry<Character, Integer> entry : entries) {
                            String s = entry.getValue() + "" + entry.getKey();
                            sb.append(s);
                        }
                        set.clear();
                        count = 1;

                    }
                    if (set.containsKey(chars[j])) {
                        count = set.get(chars[j]);
                        count++;
                        set.put(chars[j],count);
                    }else {
                        set.put(chars[j],1);
                    }

                    if (j == chars.length - 1) {
                        String s = "" + count + chars[j];
                        sb.append(s);
                        set.clear();
                    }
                }
            }

            Set<Map.Entry<Character, Integer>> entries = set.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                String s = entry.getValue() + "" + entry.getKey();
                sb.append(s);
            }
            set.clear();
            str[i] = sb.toString();

        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
