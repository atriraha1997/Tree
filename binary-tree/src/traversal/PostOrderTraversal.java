package traversal;

import node.Node;

import java.util.Objects;

public class PostOrderTraversal implements TreeTraversal {

    /**
     * In PostOrder traversal
     * we process the left subtree completely,
     * then we process the right subtree,
     * then we process the root.
     * <p>
     * Time Complexity: O(n)
     * Constant amount of work for every node.
     * <p>
     * Auxiliary Space: O(h)
     * Since in worst case h+1 function calls will be there in function call stack.
     * Where h is the height of binary tree.
     *
     * @param node
     */
    @Override
    public void traverse(Node node) {
        if (Objects.nonNull(node)) {
            traverse(node.getLeft());
            traverse(node.getRight());
            System.out.printf("%d ", node.getKey());
        }
    }
}
