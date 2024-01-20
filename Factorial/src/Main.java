import java.util.Scanner;

public class Main {
    static int fact = 1;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = sc.nextInt();
//        int fact = 1;
//        for(int i = 1; i<=num; i++){
//            fact = fact*i;
//        }
//        System.out.println("Value of " + num + " factorial is " + " = " + fact);


//          Using Recursion
        int num = 5;
        Main ma = new Main();
        ma.Fact(num);
        System.out.println("Factorial of " + num + " is " + fact);

    }

    void Fact(int num){
        if(num > 1){
            fact = fact * num;
            Fact(num - 1);
        }
    }
}