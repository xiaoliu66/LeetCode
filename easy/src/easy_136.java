import java.util.ArrayList;
import java.util.HashSet;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-16 14:15
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int i = singleNumber(arr);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        // 将数组中的每个元素分别存储到list和set集合中。
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            set.add(nums[i]);
        }
        int firstIndex = 0, lastIndex = 0;
        for (Integer integer : set) {
            firstIndex = list.indexOf(integer);
            lastIndex = list.lastIndexOf(integer);
            if (firstIndex == lastIndex) return integer;
        }

        return 0;
    }
}
