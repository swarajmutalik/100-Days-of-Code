import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int a[] = {8, 5, 10, 12, 3, 1, 4};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Even Number are as follows: ");
        for (int num1 : al1) {
            sum1 = sum1 + num1;
            System.out.println(num1);

        }

        //          Counting the number of even numbers that are present in the Arraylist
        System.out.println("Number of even numbers that are present " + al1.size());

//            Sum of all the even numbers that are present in the list
        System.out.println("Sum of all the even numbers " + sum1);

        System.out.println("Odd Numbers are as follows : ");
        for (int num2 : al2) {
            sum2 = sum2 + num2;
            System.out.println(num2);

        }
        //            Counting the number of odd numbers that are stored in the Arraylist
        System.out.println("Number of odd numbers that are present " + al2.size());

//            Sum of all the odd numbers that are present in the Arraylist
        System.out.println("Sum of all the odd numbers " + sum2);
    }
}