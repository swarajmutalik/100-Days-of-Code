import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        int rem;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        if (num == rev) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}