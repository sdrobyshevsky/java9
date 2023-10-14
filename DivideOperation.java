public class DivideOperation implements OperationStrategy {
    @Override
    public int performOperation(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }
}
