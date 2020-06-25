import java.util.Scanner;

public class Scanner_Test {

    public String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("State a number: ");
        String num1 = input.nextLine();
        return num1;
    }

    public static void main(String[] args) {
        Scanner_Test test = new Scanner_Test();
        System.out.println("You gave the number " + test.getUserInput());
    }

}
