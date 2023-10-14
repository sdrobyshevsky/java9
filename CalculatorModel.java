public class CalculatorModel {
    private int result;
    private OperationStrategy operationStrategy;

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void performOperation(int num1, int num2) {
        result = operationStrategy.performOperation(num1, num2);
    }

    public int getResult() {
        return result;
    }
}
