package Tree;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) { // 트리가 같은 트리 인지 확인하는 코드 간단히 BFS를 쓰면 구현 가능 기본적으로 true 리턴과 틀린경우에만 false리턴
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if(node1 == null && node2 == null){
                continue;
            }
            if(node1 == null || node2 == null){
                return false;
            }

            if(node1.val != node2.val){
                return false;
            }
            queue.add(node1.left);
            queue.add(node1.right);
            queue.add(node2.left);
            queue.add(node2.right);
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
