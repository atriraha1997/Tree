import node.Node;
import traversal.InOrderTraversal;
import traversal.PostOrderTraversal;
import traversal.PreOrderTraversal;
import traversal.TreeTraversal;

public class Main {

    public static Node getTree(){
        Node rootNode = new Node(1);
        rootNode.setLeft(new Node(2));
        rootNode.setRight(new Node(3));
        rootNode.getLeft().setLeft(new Node(4));
        return rootNode;
    }
    public static void main(String[] args) {

        System.out.println("Inorder traversal of Binary Tree:");
        TreeTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.traverse(getTree());

        System.out.println("\nPreorder traversal of Binary Tree:");
        TreeTraversal preOrderTraversal= new PreOrderTraversal();
        preOrderTraversal.traverse(getTree());

        System.out.println("\nPostorder traversal of Binary Tree:");
        TreeTraversal postOrderTraversal= new PostOrderTraversal();
        postOrderTraversal.traverse(getTree());
    }
}