// Different methods of printing exception information
public class Main {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
//          prints all the exception information
            e.printStackTrace();

//          prints the information related to exception description and exception name
            System.out.println(e);

//          prints the information related to only the name of the exception that has occured
            System.out.println(e.getMessage());
        }
    }
}