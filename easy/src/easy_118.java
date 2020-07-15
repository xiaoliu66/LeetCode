import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-15 15:43
 * <p>
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_118 {
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        for (List<Integer> integers : generate) {
            System.out.println(integers);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) return list;

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        if (numRows == 1) return list;

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);

        list.add(list2);
        if (numRows == 2) return list;

        // 如果numrows大于2，取出list中的前一个元素集合。
        if (numRows > 2) {
            for (int i1 = 3; i1 <= numRows; i1++) {
                ArrayList<Integer> list3 = (ArrayList<Integer>) list.get(i1 - 2);
                ArrayList<Integer> temp = new ArrayList<>(numRows);

                // 如果是集合第一个元素和最后一个元素，直接添加1
                temp.add(1);

                for (int i = 1; i < list3.size(); i++) {
                    // 下一个集合中的第i个元素的值等于 上一个集合中第i个元素加第i-1个元素的值。
                    int j = list3.get(i) + list3.get(i - 1);
                    temp.add(j);
                }
                temp.add(1);

                // 计算完，list再把这个集合添加。
                list.add(temp);
            }
        }
        return list;
    }
}
