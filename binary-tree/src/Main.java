import node.Node;
import traversal.InorderTraversal;
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
        Node node = getTree();
        TreeTraversal traversal = new InorderTraversal();
        traversal.traverse(getTree());
    }
}