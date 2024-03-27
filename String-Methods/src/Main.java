public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "";
        String s5 = "  abc   ";
        String s6 = "hello";
        String s7 = "a";
        String s8 = "A";
        String s9 = "this is a demo string";

//      == operator
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
//
////      .equals() method
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

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


//        .equalsIgnoreCase() method
        System.out.println(s1.equalsIgnoreCase(s6));

//        .compareTo() method
        System.out.println(s7.compareTo(s8));

//        .concat() method
        System.out.println(s1.concat(s8));

//        .join() method
        System.out.println(String.join(",",s1,s8));

//        .subSequence() method
        System.out.println(s9.subSequence(4,9));

//        .subString() method
        System.out.println(s9.substring(3));
        System.out.println(s9.substring(3,12));
      }
}