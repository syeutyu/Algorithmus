package Tree;


class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class BinarySearchTree {

    static void add_Node(Node node, Node target) {
        if (target.val < node.val) {
            if (node.left == null) {
                node.left = target;
            } else {
                add_Node(node.left, target);
            }
        } else {
            if (node.right == null) {
                node.right = target;
            } else {
                add_Node(node.right, target);
            }
        }
    }

    static void search(Node node, int target) {
        if (node == null) {
            System.out.println("찾을수없음");
            return;
        }
        if (target == node.val) {
            System.out.println("찾기 성공");
        } else if (target < node.val) {
            search(node.left, target);
        } else {
            search(node.right, target);
        }
    }


    public static void main(String[] args) {
        Node n1 = new Node(10);
        add_Node(n1, new Node(7));
        add_Node(n1,new Node(13));
        search(n1, 7);
        search(n1,12);
    }
}
