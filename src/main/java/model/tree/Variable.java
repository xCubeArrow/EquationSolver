package model.tree;

public class Variable  {
    char variableName;

    public Variable(char variableName) {
        this.variableName = variableName;
    }

    public char getVariableName() {
        return variableName;
    }

    public void setVariableName(char variableName) {
        this.variableName = variableName;
    }

    @Override
    public String toString() {
        return String.valueOf(variableName);
    }
}