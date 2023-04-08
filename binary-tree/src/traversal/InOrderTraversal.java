package traversal;

import node.Node;

import java.util.Objects;

public class InOrderTraversal implements TreeTraversal {

    /**
     * In Inorder traversal we recursively visit left subtree,
     * then process the root and then the right subtree.
     *
     * Time Complexity: O(n)
     * Constant amount of work for every node.
     *
     * Auxiliary Space: O(h)
     * Since in worst case h+1 function calls will be there in function call stack.
     * Where h is the height of binary tree.
     *
     * @param rootNode
     */
    @Override
    public void traverse(Node rootNode) {
        if (Objects.nonNull(rootNode)) {
            traverse(rootNode.getLeft());
            System.out.printf("%d ",rootNode.getKey());
            traverse(rootNode.getRight());
        }
    }
}
