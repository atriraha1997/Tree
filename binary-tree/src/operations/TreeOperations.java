package operations;

import node.Node;

import java.util.Objects;

public class TreeOperations {


    /**
     * To find maximum height of a binary tree,
     * from root to leaf node.
     * <p>
     * Time Complexity: O(n)
     * Auxiliary Space: O(h)
     *
     * @param node
     * @return
     */
    public Integer getHeight(Node node) {
        if (Objects.isNull(node)) {
            return 0;
        }
        return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
    }

    /**
     * To print all the nodes at the given distance from the root node.
     * <p>
     * Time Complexity: O(n)
     * Auxiliary Space: O(h)
     *
     * @param node
     * @param distance
     */
    public void printNodesAtDistance(Node node, int distance) {
        if (Objects.isNull(node)) {
            return;
        }
        if (distance == 0) {
            System.out.printf("%d ", node.getKey());
        }
        printNodesAtDistance(node.getLeft(), distance - 1);
        printNodesAtDistance(node.getRight(), distance - 1);
    }
}
