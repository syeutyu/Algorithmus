package LinkedList;

public class RevereList {

    static void reverse(ListNode n) {
        ListNode n1 = null;
        ListNode n2;
        while (n != null) {
            n2 = n.next;
            n.next = n1;
            n1 = n;
            n = n2;
        }
        System.out.println(n1);
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(19);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        reverse(n1);

    }

}
