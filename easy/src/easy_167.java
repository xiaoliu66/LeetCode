import java.util.Arrays;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-17 20:46
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_167 {
    public static void main(String[] args) {
        int[] arr = {12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,221,227,230,277,282,306,
                314,316,321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,
                506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,
                815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997};
        //int[] arr = {2, 7, 11, 15};
        int[] ints = twoSum(arr, 542);
        System.out.println(Arrays.toString(ints));
    }

    /*public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        // 暴力法
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
        }

        return arr;
    }*/

    /*public static int[] twoSum(int[] numbers, int target) {
        // 优化后的暴力破解法
        int left = 0, right = numbers.length - 1, mid = (left + right) / 2;
        int[] arr = new int[2];

        if (target < numbers[mid]) {
            right = mid;
        }

        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right ; j++) {
                if (target == numbers[i] + numbers[j]) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
        }
        return arr;
    }*/

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] arr = new int[2];
        while (true) {
            // 先判断这两个数之和和目标值是否相等。如果相等，直接返回.
            // 不相等则判断右边的数和目标值的大小比较。
            // 1. 如果 两数之和 < target ----> 移动左指针 ++。
            // 2. 如果 两数之和 > target ----> 移动右指针 --。
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                return arr;
            }else if (sum < target){
                left++;
            }else {
                right --;
            }
        }

    }

}
