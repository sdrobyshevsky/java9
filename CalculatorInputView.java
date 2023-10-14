import java.util.Scanner;

public class CalculatorInputView {
    private Scanner scanner;

    public CalculatorInputView() {
        scanner = new Scanner(System.in);
    }

    public String getOperation() {
        System.out.println("Введите операцию: (+,-,*,/)");
        return scanner.nextLine();
    }

    public int getOperand() {
        System.out.println("Введите число: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
