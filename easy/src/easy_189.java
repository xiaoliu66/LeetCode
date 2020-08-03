import java.util.ArrayList;
import java.util.Arrays;

/*
 * @version: v1.0
 * @author: liu
 * @create: 2020-08-02 18:20
 *给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class easy_189 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        rotate(arr,3);
    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];
            for (int j = nums.length -1 ; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
