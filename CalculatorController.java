public class CalculatorController {
    
    private CalculatorModel model;
    private CalculatorOutputView view;

    public CalculatorController(CalculatorModel model, CalculatorOutputView view) {
        this.model = model;
        this.view = view;
    }

    public void performOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+":
                model.setOperationStrategy(new AddOperation());
                break;
            case "-":
                model.setOperationStrategy(new SubtractOperation());
                break;
            case "*":
                model.setOperationStrategy(new MultiplyOperation());
                break;
            case "/":
                model.setOperationStrategy(new DivideOperation());
                break;
            default:
                System.out.println("Некорректная операция!");
        }
        model.performOperation(num1, num2);
        view.displayResult(model.getResult());
    }
}