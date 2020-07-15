import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-15 16:36
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 **/
public class easy_119 {
    public static void main(String[] args) {
        List<Integer> row = getRow(3);
        System.out.println(row);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(rowIndex+1);
        List<Integer> list2 = new ArrayList<>(rowIndex+1);
        list.add(1);
        if (rowIndex == 0) return list;

        list.add(1);
        if (rowIndex == 1) return list;
        list2.add(1);
        list2.add(1);

        if (rowIndex > 1) {
            // 这层循环代表从第2层到rowIndex，总共算几层。
            for (int i = 2; i <= rowIndex; i++) {
                list.clear();
                list.add(0,1);
                for (int j = 1; j < list2.size(); j++) {
                    int i1 = list2.get(j) + list2.get(j - 1);
                    list.add(i1);
                }
                list.add(1);
                list2.clear();
                list2.addAll(list);
            }
        }
        return list;
    }
}
