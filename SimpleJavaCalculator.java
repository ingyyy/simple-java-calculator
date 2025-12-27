import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter your name ");
        String name = input.nextLine();
        System.out.println("Hello "+ name + " please enter the 1st  number");
        double num1 = input.nextDouble();
        System.out.println( "please enter the 2nd  number");
        double num2 = input.nextDouble();
        System.out.println( "Choose the operator \n a.+ \n b./\\ \n c.* \n d.- ");
        char operator = input.next().charAt(0);
        System.out.println("So your result equal = ");
        switch (operator) {
    case 'a':
    case 'A':
        System.out.println(num1 + num2);
        break;
    case 'b':
    case 'B':
        System.out.println(num1 / num2);
        break;
    case 'c':
    case 'C':
        System.out.println(num1 * num2);
        break;
    case 'd':
    case 'D':
        System.out.println(num1 - num2);
        break;
    default:
        System.out.println("Invalid operator");
        }
    }
}