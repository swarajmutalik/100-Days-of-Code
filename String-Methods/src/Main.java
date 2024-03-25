public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "";
        String s5 = "  abc   ";

//      == operator
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//
////      .equals() method
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));

//       .length() method
        System.out.println(s1.length());
        int i = s1.length();
        if(i == 0){
            System.out.println("String is empty");
        }

//        .isEmpty() method
        System.out.println(s1.isEmpty());

        if(s4.isEmpty() == true){
            System.out.println("String is empty");
        }

//        .trim() method
        System.out.println(s5);
        System.out.println(s5.trim());

     }
}