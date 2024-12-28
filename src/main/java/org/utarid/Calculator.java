package org.utarid;

class Calculator implements ICalculator {

    @Override
    public int calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        switch (operation) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                try {
                    return operand1 / operand2;
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalArgumentException("Operation '" + operation + "' does not exist");
        }
    }
}
