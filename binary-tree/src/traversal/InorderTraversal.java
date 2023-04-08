package traversal;

import node.Node;

import java.util.Objects;

public class InorderTraversal implements TreeTraversal {
    @Override
    public void traverse(Node rootNode) {
        if (Objects.nonNull(rootNode)) {
            traverse(rootNode.getLeft());
            System.out.printf("%d ",rootNode.getKey());
            traverse(rootNode.getRight());
        }
    }
}
