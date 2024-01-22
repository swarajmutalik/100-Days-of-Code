import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name = sc.next();
        int leng = name.length();
        String rev = "";
        for(int i = leng - 1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("The String after reversing is as follows " + rev);
    }
}