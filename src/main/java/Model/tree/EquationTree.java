package Model.tree;

import Model.operations.Operation;

import java.util.List;

public class EquationTree extends Node<Operation>{

    public EquationTree(List<Node<Operation>> childrenNodes) {
        super(childrenNodes);
    }
}