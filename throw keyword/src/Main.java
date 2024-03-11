import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");

        int age = sc.nextInt();
        if(age < 18){
            throw new YoungerAgeException("You are not eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}