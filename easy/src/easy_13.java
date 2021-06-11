import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/11 23:10
 * @version 1.0
 */
public class easy_13 {
    public int romanToInt(String s) {
        int[] num = new int[s.length()+1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case 'I':
                    num[i] = 1;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'X':
                    num[i] = 10;
                    break;
                case 'L':
                    num[i] = 50;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'M':
                    num[i] = 1000;
                    break;
                default:
                    return 0;
            }

        }
        // 遍历数组 检查当前元素的值是否比后一个小
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                list.add(num[i]);
                break;
            }
            if (num[i] < num[i+1]) {
                list.add(num[i+1] - num[i]);
                i++;
            }else {
                list.add(num[i]);
            }
        }
        // 集合中的元素累加求和
        Integer integer = list.stream().reduce(Integer::sum).get();
        return integer;
    }
}
