import java.util.Arrays;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-18 10:07
 *
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_169 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int i = majorityElement(arr);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        /*
            先把数组按照从小到大的顺序进行排序。
            然后从数组索引1开始和前一个数字进行比较。如果相等则继续，计数器加一。
            不相等，则判断计数器的值和n/2的大小。比它大则结束程序，输入这个数值。
         */
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int target = nums.length / 2;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (count > target) return nums[i-1];
            }else {
                count++;
                if (count > target) return nums[i];
            }
        }

        return -1;
    }
}
