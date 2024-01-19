import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int no1 = sc.nextInt();
            System.out.println("Enter the second number:");
            int no2 = sc.nextInt();
            System.out.println("Enter the Symbol(+,-,*,/)");
            String sym = sc.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is: " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction is:" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication is:" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Division is:" + res);
                    break;
                default:
                    System.out.println("Invalid Symbol");
                    break;
            }
            System.out.println("Do you wish to continue (Press Y for Yes or N for No)");
            yn = sc.next();

        } while (yn.equals("y") || yn.equals("Y"));
    }
}