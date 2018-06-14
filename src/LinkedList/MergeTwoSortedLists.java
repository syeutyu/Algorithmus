package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoSortedLists {

    static boolean hasCycle(ListNode head) { // 원형 링크드 리스트가 되는지 체크해주는 함수
        if (head == null) return false; // 먼저 head가 null이면 return

        ListNode slow = head; // 현재 노드
        ListNode fast = head.next; // 다음 노드
        while (slow != fast) { // 현재와 다음노드가 같지 않을때까지
            if (fast == null || fast.next == null) return false; // 다음노드와 그다음 노드가 null 이면 return

            slow = slow.next; // 즉 노드 head.next 가 되겠네요
            fast = fast.next.next; // 노드의 다다음 값 (한번 갔다 와야하기에)
        }

        return true;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) { // 두개의 링크드리스트 합치는 메소드
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode listNode = new ListNode(0); // 변수 생성
        ListNode listNode2 = listNode;
        while (l1 != null && l2 != null) { // 두개중 하나가 null일 때까지 반복
            if (l1.val <= l2.val) { // 만약 l1의 값이 작거나 같으면
                listNode2.next = l1; // 다음 next로 지정
                l1 = l1.next;
            } else {
                listNode2.next = l2;
                l2 = l2.next;
            }
            listNode2 = listNode2.next; // 다음 이동
        }
        if (l1 != null) { // 만약 둘중하나가 비어있으면 그때 push
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
        l2.next = l3;

        l5.next = l4;
       mergeTwoLists(l1, l5);
        System.out.println(hasCycle(l1));
    }
}
