package com.cubearrow.model.tree;

import com.cubearrow.model.operations.Operation;

public class Node {
    private static final String OPERATION_REGEX = "\\+|\\*|\\-|\\/";


    Node left;
    Node right;
    Node parent;

    public Node(Node left, Node right, Node parent) {
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    /**
     * Parses a {@link Node} from a {@link String} by trying to parse every option of a {@link Node}
     *
     * @param stringToParse The {@link String} that contains the {@link Node}
     * @return Returns the parsed Node
     */
    public static Node fromString(String stringToParse, Node parent) {

        Number n = Number.fromString(stringToParse, parent);
        if (n != null) {
            return n;
        }

        Variable v = Variable.fromString(stringToParse, parent);
        if (v != null) {
            return v;
        }

        return Operation.fromString(stringToParse, parent);

    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
