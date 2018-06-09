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

    static void preOrder(Node node){
        System.out.print(node.val+"\t");
        if(node.left != null){
            preOrder(node.left);
        }
        if(node.right != null){
            preOrder(node.right);
        }
    }

    static void inOrder(Node node){
        if(node.left != null){
            inOrder(node.left);
        }
        System.out.print(node.val+"\t");
        if(node.right != null){
            inOrder(node.right);
        }
    }

    static void postOrder(Node node){
        if(node.left != null){
            postOrder(node.left);
        }
        if(node.right != null){
            postOrder(node.right);
        }
        System.out.print(node.val+"\t");
    }

    public static void main(String[] args) {
        Node n1 = new Node(5);
        add_Node(n1, new Node(3));
        add_Node(n1,new Node(1));
        add_Node(n1,new Node(4));
        add_Node(n1,new Node(7));
        add_Node(n1,new Node(10));

        search(n1, 7);
        search(n1,12);
        preOrder(n1);
        System.out.println();
        inOrder(n1);
        System.out.println();
        postOrder(n1);
    }
}
