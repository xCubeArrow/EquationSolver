package com.cubearrow.model.equation;

import com.cubearrow.model.operations.Operation;
import com.cubearrow.model.tree.Node;

public class EquationInitializer {
    private final String equationString;

    public EquationInitializer(String equationString) {
        this.equationString = equationString;
    }

    /**
     * Gets the index of the closing bracket of the first starting bracket.
     * Example:
     * ((4+2)*3)-(3+2)
     * Returns: 8
     *
     * @param equationPart The {@link String} that contains the part of the {@link Equation} with the brackets
     * @return Returns the index of the closing bracket
     */
    public static int getLastIndexOfFirstBrackets(String equationPart) {
        int bracketAmount = 0;
        for (int i = 0; i < equationPart.length(); i++) {
            char charAtIndex = equationPart.charAt(i);
            if (charAtIndex == '(') {
                bracketAmount++;
            } else if (charAtIndex == ')') {
                bracketAmount--;
                if (bracketAmount == 0) {
                    return i + 1;
                }
            }

        }
        return -1;
    }

    /**
     * Removes the brackets from a String that is to be parsed to an {@link Operation}
     *
     * @param operationString The operationString whose brackets should be removed
     * @return Returns the new String that contains the Operation
     */
    public static String removeBracketsFromOperationIfNecessary(String operationString) {
        if (operationString.startsWith("(")) {
            return operationString.substring(1, operationString.length() - 1);
        }
        return operationString;
    }

    /**
     * Initializes an equation based on a String.
     * It uses recursion to get the information in the brackets of the operation and generates a
     *
     * @return Returns an {@link Equation} instance with the information
     */
    public Equation parseEquation() {
        String[] split = this.equationString.split("=");
        Equation equation = new Equation();
        equation.setLeft(Node.fromString(split[0], equation));
        equation.setRight(Node.fromString(split[1], equation));
        return equation;
    }
}