import java.util.Arrays;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-05 20:02
 * <p>
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1:
 * <p>
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 * 注意这五个元素可为任意顺序。
 * 你不需要考虑数组中超出新长度后面的元素。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_27 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3};
        int a = 2;
        int result = removeElement(arr, a);
        System.out.println(result);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr 数组名
     * @param a   要找的值
     *
     * @return 修改后数组的长度
     * <p>
     * 1.先把传入的数组进行排序。
     * 2.用查找出数组中，元素所在的位置。
     * 3.删除该元素。符合条件的元素可能有多个。
     */
    private static int removeElement(int[] arr, int a) {
        // 排序
        Arrays.sort(arr);
        // 二分查找
        int index = findElement(arr, a);
        int count = 0;
        for (int i = index; i < arr.length; i++) {
            if (a == arr[i]) {
                count++;
            } else {
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            int temp = arr[index + i];
            arr[index + i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr.length - count;
    }

    public static int findElement(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return 0;
    }
}
