package com.cubearrow.model.tree.nodes.operations;

import com.cubearrow.model.tree.nodes.Operation;
import com.cubearrow.model.tree.Node;
import com.cubearrow.model.tree.nodes.Number;

public class Addition extends Operation {

    public final static char OPERATION_STRING = '+';

    public Addition(String string, Node parent) {
        super(string, OPERATION_STRING, parent);
    }

    public Addition() {
    }


    public Addition(Node left, Node right, Node parent) {
        super(left, right, parent);
    }

    public Addition(Node left, Node right) {
        super(left, right, null);
    }


    @Override
    public Number getResultFromNumbers() {
        return new Number((double) this.getLeft().getValue() + (double) this.getRight().getValue(), this.getParent());
    }

}