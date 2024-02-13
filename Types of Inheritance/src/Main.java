// Single Inheritance

//class Animal {
//    void showA() {
//        System.out.println("a class method");
//    }
//}
//
//public class Main extends Animal {
//    void showB(){
//        System.out.println("b class method");
//    }
//    public static void main(String[] args) {
//        Main m = new Main();
//        m.showA();
//        m.showB();
//    }
//}

// Multilevel Inheritance

//class A {
//    void showA() {
//        System.out.println("a class method");
//    }
//}
//
//class B extends A {
//    void showB() {
//        System.out.println("b class method");
//    }
//}
//
//class Main extends B {
//    void showC() {
//        System.out.println("c class method");
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        m.showA();
//        m.showB();
//        m.showC();
//    }
//}

// Hierarchical Inheritance

class A {
    void showA() {
        System.out.println("a class method");
    }
}

class B extends A {
    void showB() {
        System.out.println("b class method");
    }
}

class Main extends A {
    void showC() {
        System.out.println("c class method");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.showA();
//        m.showB();
        m.showC();
    }
}
