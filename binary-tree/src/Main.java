public class Main {
    public static void main(String[] args) {
        Node rootNode = new Node(1);
        rootNode.setLeft(new Node(2));
        rootNode.setRight(new Node(3));
        rootNode.getLeft().setLeft(new Node(4));

        System.out.println(rootNode);
    }
}