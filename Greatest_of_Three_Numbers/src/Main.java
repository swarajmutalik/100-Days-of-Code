public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if((a > b) && (a > c)){
            System.out.println("A is the greatest among the three numbers");
        }
        else if((b > a) && (b > c)){
            System.out.println("B is the greatest among the three numbers");
        }
        else{
            System.out.println("C is the greatest among the three numbers");
        }
    }

}