// Дз на закрепление:
// Взять реализованный код в рамках последних семинаров (4-5) и продемонстрировать применение принципов,
// усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
// рефакторим, какой принцип применяем и почему.
// Формат сдачи: ссылка на гитхаб проект

// В своём решении я использовал преемущественно все принципы solid
// Принцип единой ответственности (Single responsibility principle), класс Calculator был разделён на 2 класса: CalculatorInputVeiw и CalculatorOutputView. 
// В первом классе будет происходить только получение данных от пользователя, а второй класс отвечает только за вывод результатов.
// Принцип открытости-закрытости (Open-closed principle), был создан интерфейс OperationStrategy для представления отдельной операции и 
// созданы классы для реализации каждой операции: AddOperation, SubstractOperation, MultiplyOperation, DivideOperation. 
// Это позволит добавлять новые операции без изменения уже существующего кода.
// Принцип подстановки Барбары Лисков (Liskov substitution principle), тот же интерфейс OperationStrategy позволяет без добавления конкретных классов, без изменения
// кода добавить новую функциональность в классе CalculatorModel. Из - за этого класс CalculatorModel может принимать любую реализацию интерфейса OperationStrategy.
// Принцип разделения интерфейса (Interface segregation principle), при улучшении кода уже был выполнен принцип разделения интерфейса путем создания отдельных 
// интерфейсов для операций OperationStrategy и визуализации CalculatorOutputView, таким образом пользователь будет использовать только те методы, которые ему необходимы, 
// что улучшает код и позволяет лучше поддерживать и расширять его в будущем.
// Принцип инверсии зависимостей (Dependency inversion principle), в классе CalculatorController происходит инвертирование зависимостей от классов CalculatorModel 
// и CalculatorOutputView. Вместо того, чтобы создавать их экземпляры внутри CalculatorController, мы передаем их через конструктор.


public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorInputView inputView = new CalculatorInputView();
        CalculatorOutputView outputView = new CalculatorOutputView();
        CalculatorController controller = new CalculatorController(model, outputView);

        String operation = inputView.getOperation();
        int num1 = inputView.getOperand();
        int num2 = inputView.getOperand();

        controller.performOperation(operation, num1, num2);
    }
}