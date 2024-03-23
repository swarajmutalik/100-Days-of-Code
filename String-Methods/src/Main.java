public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

//      == operator
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

//      .equals() method
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}