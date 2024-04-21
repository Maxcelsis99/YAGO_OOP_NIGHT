
package SimpleCalculator;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;

    public Calculator() {
        // Constructor
        operand1 = 0;
        operand2 = 0;
        operator = ' ';
    }

    public void setOperand(double operand) {
        if (operator == ' ') {
            operand1 = operand;
        } else {
            operand2 = operand;
        }
    }

    public void setOperator(char op) {
        operator = op;
    }

    public double calculate() {
        double result = 0;
        switch (operator) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> {
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    result = Double.NaN; // Handle division by zero
                }
            }
            
            default -> System.out.println("Invalid operator");
        }
        return result;
    }
}
