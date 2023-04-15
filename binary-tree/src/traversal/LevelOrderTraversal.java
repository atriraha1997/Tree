package traversal;

import node.Node;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class LevelOrderTraversal implements TreeTraversal {

    /**
     * In level order traversal we process all the nodes from left to right,
     * level by level.
     * <p>
     * Time Complexity : θ(n)
     * Auxiliary Space : θ(w),
     * where w is the width of the binary tree.
     *
     * @param node
     */
    @Override
    public void traverse(Node node) {
        if (Objects.isNull(node)) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.printf("%d ", currentNode.getKey());
            if (Objects.nonNull(currentNode.getLeft())) {
                queue.add(currentNode.getLeft());
            }
            if (Objects.nonNull(currentNode.getRight())) {
                queue.add(currentNode.getRight());
            }
        }

    }

    /**
     * To keep a track of one level we add null in the queue and
     * whenever we encounter a null, we print a new line
     * and insert a null again in the queue.
     * <p>
     * Time Complexity: O(n)
     * Auxiliary Space: θ(w),
     * where w is the width of the binary tree.
     *
     * @param node
     */
    public void traverseLineByLine(Node node) {
        if (Objects.isNull(node)) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while (queue.size() > 1) {
            Node currentNode = queue.poll();
            if (Objects.isNull(currentNode)) {
                System.out.println();
                queue.add(null);
            } else {
                System.out.printf("%d ", currentNode.getKey());
                if (Objects.nonNull(currentNode.getLeft())) {
                    queue.add(currentNode.getLeft());
                }
                if (Objects.nonNull(currentNode.getRight())) {
                    queue.add(currentNode.getRight());
                }
            }
        }
    }
}
