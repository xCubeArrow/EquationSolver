package model.tree;

public class Node {
    Node left;
    Node right;

    public Node(Node left, Node right) {
        this.right = right;
        this.left = left;
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
