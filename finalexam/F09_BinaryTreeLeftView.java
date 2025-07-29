import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        if (parts[0].equals("-1")) {
            System.out.println("LeftView:");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(parts[0]));
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < parts.length) {
            TreeNode curr = queue.poll();
            if (!parts[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(parts[i]));
                queue.offer(curr.left);
            }
            i++;
            if (i < parts.length && !parts[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(parts[i]));
                queue.offer(curr.right);
            }
            i++;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        System.out.print("LeftView:");
        while (!q.isEmpty()) {
            int size = q.size();
            for (int j = 0; j < size; j++) {
                TreeNode node = q.poll();
                if (j == 0) System.out.print(" " + node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }
        System.out.println();
    }
}

