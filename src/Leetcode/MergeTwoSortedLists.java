package Leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode listNode = new ListNode(0);
        ListNode listNode2 = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                listNode2.next = l1;
                l1 = l1.next;
            } else {
                listNode2.next = l2;
                l2 = l2.next;
            }
            listNode2 = listNode2.next;
        }
        if (l1 != null) {
            listNode2.next = l1;
        }
        if (l2 != null) {
            listNode2.next = l2;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l5 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l4;
        l5.next = l3;
        l3.next = l4;
        mergeTwoLists(l1, l5);
    }
}
