import java.util.Iterator;
import java.util.LinkedList;

/**
 * @version: v1.0
 * @author: Liu
 * @create: 2020-07-05 11:10
 *
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class easy_21 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(2,a1);
        ListNode a3 = new ListNode(1,a2);

        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(3,a1);
        ListNode b3 = new ListNode(1,a2);
        ListNode listNode = mergeTwoLists(a3, b1);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         return l1;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
