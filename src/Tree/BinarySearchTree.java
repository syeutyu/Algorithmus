package Tree;


import java.util.LinkedList;
import java.util.Queue;

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
    static boolean checkBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean check(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return (check(node.left, min, node.val) && check(node.right, node.val, max));
    }

    static void add_Node(Node node, Node target) { // 부모노드와 자식 노드를 매개변수로 받는다
        if (target.val < node.val) {  // 넣을 Node 값이 부모노드 보다 작다면 left에 넣는다
            if (node.left == null) { // 비어있다면 넣고
                node.left = target;
            } else { // 아니면 재귀를 이용해서 left 노드로 이동
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

    static int search(Node node, int target) {

        int returnValue; // 리턴을 위한 값

        if (node == null) { // node를 찾지 못한다면 0 return
            return 0;
        }

        if (target == node.val) { // 찾는다면 1 return
            return 1;
        } else if (target < node.val) { // 삽입과 마찬가지로 값이 작거나 큰거에 따라 노드이동
            returnValue = search(node.left, target);
        } else {
            returnValue = search(node.right, target);
        }
        return returnValue;
    }


    /*
    삭제의 경우에는 총 3가지의 경우의 수가 존재하는데

    1. 삭제할 노드가 단일 노드인 경우
     - 이경우는 그냥 노드를 null 값으로 만들어주면 끝 ^^

    2. 삭제할 노드가 하나의 자식이 존재할 경우
     - 이경우는 자신의 노드를 삭제하고 부모 노드의 연결 선을 자식에 이어주면 끝!!

    3. 삭제할 노드에 두개의 자식이 존재할 경우
     - 이경우는 좀 빡신데 먼저 두가지 방식이 존재한다

      3.1 왼쪽 노드에서 가장 큰 값인 노드를 삭제한 노드에 연결
      3.2 오른쪽 노드에서 가장 작은 값인 노드를 삭제한 노드에 연결
      이런 두가지 방식이 존재합니다
     */
    static Node delete(Node node, int target) {
        if (node == null) { // 들어온 Node가 없을경우 출력
            System.out.println("Not Delete " + target);
            return null;
        }
        if (node.val == target) { // target인 노드를 찾을경우 이때부터 위에말한 3가지 경우의 수 비교
            if (node.left == null && node.right == null) { // 단일노드
                return null;
            } else if (node.left == null) { //하나의 자식을 지닌 노드
                return node.right;
            } else if (node.right == null) { //하나의 자식을 지닌 노드
                return node.left;
            } else { // 두개의 자식을 지닌 노드
                node.val = changeNodeValue(node.right); // 3.2를 위해 오른쪽 노드에서 가장 작은 값 찾아오기
                removeNode(node, node.right, node.val); // 가장 작은 노드 값을 찾으면 연결을 하기위한 메소드
            }
        } else if (node.val < target) {
            node.right = delete(node.right, target);
        } else {
            node.left = delete(node.left, target);
        }
        return node;
    }

    static int changeNodeValue(Node right) { // 이진 트리의 구조상 부모의 왼쪽 자식의 값은 항상 더 작은걸 이용
        if (right.left == null) { // left가 null인 지금 노드가 가장 작은 노드값
            return right.val;
        } else { // 위의 조건을 위한 재귀
            return changeNodeValue(right.left);
        }
    }

    static void removeNode(Node origin, Node right, int target) {
        if (right.val == target) { // 오른쪽 노드의 값이 가장 작은경우가 맞으면
            if (origin.left == right) { // 넘어온 부모노드에서의 위치를 찾는다
                origin.left = right.left; // 찾으면 그때 연결
            } else {
                origin.right = right.right;
            }
        } else if (right.val < target) { // 값이 작다면 삽입, 검색과 마찬가지로 해당하는 노드를 찾기위한 재귀
            removeNode(right, right.right, target);
        } else {
            removeNode(right, right.left, target);
        }
    }

    static void preOrder(Node node) { // 정점 -> 왼쪽 -> 오른쪽 (루트가 가장 먼저)
        System.out.print(node.val + "\t");
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }

    static void inOrder(Node node) { // 왼쪽 -> 정점 -> 오른쪽 (가장 왼쪽 노드 부터 출력)
        if (node.left != null) {
            inOrder(node.left);
        }
        System.out.print(node.val + "\t");
        if (node.right != null) {
            inOrder(node.right);
        }
    }

    static void postOrder(Node node) { // 왼쪽 -> 오른쪽 -> 정점 (루트가 가장 나중에, 가장 왼쪽 노드가 처음)
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.print(node.val + "\t");
    }

    static void levelOrder(Node node) { // 정점 -> 인근 노드  (큐를 이용한 순회 마치 BFS 같음)
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(node);
        while (!nodes.isEmpty()) {
            Node n1 = nodes.poll();
            System.out.print(n1.val + " ");
            if (n1.left != null) {
                nodes.offer(n1.left);
            }
            if (n1.right != null) {
                nodes.offer(n1.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node n1 = new Node(8);
        add_Node(n1, new Node(3));
        add_Node(n1, new Node(10));
        add_Node(n1, new Node(2));
        add_Node(n1, new Node(4));

        add_Node(n1, new Node(5));
        add_Node(n1, new Node(1));
        add_Node(n1, new Node(11));
        add_Node(n1, new Node(16));

        postOrder(n1);
        System.out.println(checkBST(n1));
//        System.out.println(search(n1, 7));
//        System.out.println(search(n1, 12));
    }
}
