/**
 * @version : v1.0
 * @author: liu
 * @create: 2020-05-27 22:22
 * 
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] temp = twoSum(arr,6);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    temp[index] = i;
                    temp[index + 1] = j;
                }
            }
        }
        return temp;
    }
}
