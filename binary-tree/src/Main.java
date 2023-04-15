import node.Node;
import operations.TreeOperations;
import traversal.*;

public class Main {

    public static Node getTree() {
        Node rootNode = new Node(1);
        rootNode.setLeft(new Node(2));
        rootNode.setRight(new Node(3));
        rootNode.getLeft().setLeft(new Node(4));
        rootNode.getLeft().setRight(new Node(5));
        rootNode.getLeft().getLeft().setLeft(new Node(6));
        return rootNode;
    }

    public static void main(String[] args) {

        System.out.println("Inorder traversal of Binary Tree:");
        TreeTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.traverse(getTree());

        System.out.println("\nPreorder traversal of Binary Tree:");
        TreeTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.traverse(getTree());

        System.out.println("\nPostorder traversal of Binary Tree:");
        TreeTraversal postOrderTraversal = new PostOrderTraversal();
        postOrderTraversal.traverse(getTree());

        System.out.println("\nLevel order traversal of Binary Tree:");
        TreeTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.traverse(getTree());

        System.out.println("\nLevel order traversal of Binary Tree Line by Line:");
        LevelOrderTraversal levelOrderTraversalLineByLine = new LevelOrderTraversal();
        levelOrderTraversalLineByLine.traverseLineByLine(getTree());

        TreeOperations operations = new TreeOperations();
        System.out.printf("\nHeight of Binary Tree: %d ", operations.getHeight(getTree()));

        System.out.println("\nAll Nodes at distance 2:");
        operations.printNodesAtDistance(getTree(), 2);
    }
}