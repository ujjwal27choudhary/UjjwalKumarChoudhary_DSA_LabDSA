package binarytree;
import java.util.HashSet;
import java.util.List;

public class BinaryTree {
    public Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data) {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        if(data< root.data)
        {
            root.left = insertRec(root.left, data);
        }else if(data>root.data)
        {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    private void inOrderTraversal(Node root, List<Integer>nodeList) {
        if(root != null) {
            inOrderTraversal(root.left, nodeList);
            nodeList.add(root.data);
            inOrderTraversal(root.right, nodeList);

        }
    }
    public void findPairWithSum(int sum) {
        HashSet<Integer> set = new HashSet<>();
        if (!findPairUtil(root, sum, set)) {
            System.out.println("No pair with the given sum found");
        }
    }
    private boolean findPairUtil(Node root, int sum, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }

        if (findPairUtil(root.left, sum, set)) {
            return true;
        }

        if (set.contains(sum - root.data)) {
            System.out.println("Pair found: (" + (sum - root.data) + ", " + root.data + ")");
            return true;
        } else {
            set.add(root.data);
        }

        return findPairUtil(root.right, sum, set);
    }
}
