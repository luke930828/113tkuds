import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    static TreeNode buildTree(String[] parts) {
        if (parts[0].equals("-1")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(parts[0]));
        Queue<TreeNode> queue = new LinkedList<>();
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
        return root;
    }

    static int rangeSum(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (root.val < L) return rangeSum(root.right, L, R);
        if (root.val > R) return rangeSum(root.left, L, R);
        return root.val + rangeSum(root.left, L, R) + rangeSum(root.right, L, R);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] treeInput = sc.nextLine().split(" ");
        int L = sc.nextInt(), R = sc.nextInt();
        TreeNode root = buildTree(treeInput);
        int sum = rangeSum(root, L, R);
        System.out.println("Sum: " + sum);
    }
}

