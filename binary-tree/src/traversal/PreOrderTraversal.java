package traversal;

import node.Node;

import java.util.Objects;

public class PreOrderTraversal implements TreeTraversal {

    /**
     * In Preorder traversal we process the root first,
     * then we process the left subtree completely,
     * then we process the right subtree.
     *
     * Time Complexity: O(n)
     * Constant amount of work for every node.
     *
     * Auxiliary Space: O(h)
     * Since in worst case h+1 function calls will be there in function call stack.
     * Where h is the height of binary tree.
     *
     * @param node
     */
    @Override
    public void traverse(Node node) {
        if (Objects.nonNull(node)) {
            System.out.printf("%d ",node.getKey());
            traverse(node.getLeft());
            traverse(node.getRight());
        }
    }
}
