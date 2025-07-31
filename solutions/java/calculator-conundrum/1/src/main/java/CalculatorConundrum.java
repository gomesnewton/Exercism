class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        int calcOperation = 0;

        switch(operation) {
            case "+":
                calcOperation = operand1 + operand2;
                break;
            case "-":
                calcOperation = operand1 - operand2;
                break;
            case "*":
                calcOperation = operand1 * operand2;
                break;

            case "/":

                try {
                calcOperation = operand1 / operand2;
                break;
                } catch (Exception e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }

            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            default:
                throw new IllegalOperationException("Operation '"+ operation +"' does not exist");
        }
        return String.format(
                "%d %s %d = %d",
                operand1, operation, operand2, calcOperation);
    }

}
