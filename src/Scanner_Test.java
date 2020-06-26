import java.util.Scanner;

public class Scanner_Test {

    public void getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("State your first number: ");
        double num1 = Double.parseDouble(input.nextLine());
        System.out.println("State your operator: ");
        String operator = input.nextLine();
        System.out.println("State your second number: ");
        double num2 = Double.parseDouble(input.nextLine());

        double result;

        

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            result = -1;
        }

        System.out.println("The first number you chose is " + num1);
        System.out.println("The operator you chose is " + operator);
        System.out.println("The second number you chose is " + num2);
        System.out.println("Thus, your result is " + result);

    }

    public static void main(String[] args) {
        Scanner_Test test = new Scanner_Test();
        System.out.println("This is a simple calculator");
        System.out.println("Please enter your math below:");
        while (true) {
            test.getUserInput();
        }
    }

}
