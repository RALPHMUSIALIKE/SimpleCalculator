import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the operator (+, - , *, /)");

        // Captures input from the cmd/terminal and store the in operator
        operator = input.next().charAt(0);

        System.out.println("Enter the two numbers one by one");

        // Captures input from the cmd/terminal and store the in num1, num2
        num1 = input.nextDouble();
        num2 = input.nextDouble();


        // closing the Scanner
        input.close();

        switch(operator){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f",num1, num2, (num1+num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f",num1, num2, (num1-num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f",num1, num2, (num1*num2));
                break;
            case '/':
                if(num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                }else {
                    System.out.println("Divide by zero situation");
                }break;
            default:
                System.out.printf("%c is an invalid operator", operator);
        }
    }
}
