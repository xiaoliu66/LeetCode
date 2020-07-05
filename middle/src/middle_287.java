import java.util.Arrays;

/**
 * @version : v1.0
 * @author: liu
 * @create: 2020-05-26 21:40
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 *
 * 示例 1:
 *
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * 说明：
 *
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-duplicate-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class middle_287 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int max = findDuplicate(arr);
        System.out.println(max);
    }


    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                temp =  nums[i];
                break;
            }
        }
        return temp;
    }

    // public static int findDuplicate(int[] nums) {
    //     // 创建临时数组，统计重复次数多的。
    //     int[] temp = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 temp[i] += 1;
    //             }
    //         }
    //
    //     }
    //     // 记录重复次数最多的数所在数组的索引
    //     int index = 0, max = temp[index];
    //     for (int i = 1; i < temp.length; i++) {
    //         if (temp[i-1] < temp[i]) {
    //             max = temp[i];
    //             index = i;
    //         }
    //     }
    //     return nums[index];
    // }
}
