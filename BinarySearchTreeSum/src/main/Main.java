package main;
import binarytree.BinaryTree;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes you want to insert in the binary search tree : ");
        int numNodes = scanner.nextInt();

        System.out.println("Enter the values of the nodes:");
        for (int i = 0; i < numNodes; i++) {
            int nodeValue = scanner.nextInt();
            tree.insert(nodeValue);
        }

        System.out.print("Enter the sum to find the nodes : ");
        int sum = scanner.nextInt();

        tree.findPairWithSum(sum);
    }
}
