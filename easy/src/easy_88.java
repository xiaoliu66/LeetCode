import java.util.ArrayList;
import java.util.Collections;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-13 14:28
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组.
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 *
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_88 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr,3,arr2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list1 = new ArrayList<>();

        // 往集合中添加数据
        for (int i = 0; i < m; i++) {
            list1.add(nums1[i]);
        }

        for (int i = 0; i < n; i++) {
            list1.add(nums2[i]);
        }
        // 集合排序,并将集合中的数据存入nums1数组中。
        Collections.sort(list1);
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = list1.get(i);
        }

    }
}
