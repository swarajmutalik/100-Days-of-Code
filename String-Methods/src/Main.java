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
        System.out.println("--------------------------------------");
//
////      .equals() method
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("--------------------------------------");

//       .length() method
        System.out.println(s1.length());
        int i = s1.length();
        if (i == 0) {
            System.out.println("String is empty");
        }
        System.out.println("--------------------------------------");

//        .isEmpty() method
        System.out.println(s1.isEmpty());

        if (s4.isEmpty() == true) {
            System.out.println("String is empty");
        }
        System.out.println("--------------------------------------");

//        .trim() method
        System.out.println(s5);
        System.out.println(s5.trim());
        System.out.println("--------------------------------------");


//        .equalsIgnoreCase() method
        System.out.println(s1.equalsIgnoreCase(s6));
        System.out.println("--------------------------------------");

//        .compareTo() method
        System.out.println(s7.compareTo(s8));
        System.out.println("--------------------------------------");

//        .concat() method
        System.out.println(s1.concat(s8));
        System.out.println("--------------------------------------");

//        .join() method
        System.out.println(String.join(",", s1, s8));
        System.out.println("--------------------------------------");

//        .subSequence() method
        System.out.println(s9.subSequence(4, 9));
        System.out.println("--------------------------------------");

//        .subString() method
        System.out.println(s9.substring(3));
        System.out.println(s9.substring(3, 12));
        System.out.println("--------------------------------------");

//        .replace() method
        System.out.println(s9);
        System.out.println(s9.replace("is", "was"));
        System.out.println("--------------------------------------");

//        replaceFirst() method
        System.out.println(s9);
        System.out.println(s9.replaceFirst("is", "was"));
        System.out.println("--------------------------------------");

//        replaceAll() method
        System.out.println(s9);
        System.out.println(s9.replaceAll("is(.)", "was"));
        System.out.println("--------------------------------------");

//        indexOf() method
        System.out.println(s6.indexOf('e'));
        System.out.println("--------------------------------------");


//        lastIndexOf() method
        System.out.println(s6.lastIndexOf('l'));
        System.out.println("--------------------------------------");

//        charAt() method
        System.out.println(s6.charAt(3));
        System.out.println("--------------------------------------");

//      contains() method
        System.out.println(s6.contains("he"));
        System.out.println("--------------------------------------");

//        startswith() method
        System.out.println(s6.startsWith("y"));
        System.out.println("--------------------------------------");

//        endswith() method
        System.out.println(s6.endsWith("t"));
        System.out.println("--------------------------------------");

//        toUpperCase() method
        System.out.println(s6.toUpperCase());
        System.out.println("--------------------------------------");


//        toLowerCase() method
        String s10 = "SWARAJ";
        System.out.println(s10.toLowerCase());
        System.out.println("--------------------------------------");

//        valueOf() method
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println("--------------------------------------");
        String s11 = String.valueOf(a);
        String s12 = String.valueOf(b);
        System.out.println(s11 + s12);
        System.out.println("--------------------------------------");


//        toCharArray() method
        char[] c = s11.toCharArray();
        System.out.println(c);

    }
}