// Code for refering to the immediate parent class instance variable

//class A {
//    int a = 10;
//}
//
//class Main extends A {
//
//    int a = 20;
//    void show(int i){
////        System.out.println(this.a);
//        System.out.println(super.a);
//    }
//    public static void main(String[] args) {
//      Main m = new Main();
//      m.show(30);
//    }
//}


//Code for invoking immediate parent class method

//class A {
//    void m1(){
//        System.out.println("I am in class M1");
//    }
//}
//
//class Main extends A {
//
//    void m1(){
//        System.out.println("I am in class B");
//    }
//    void show(){
//        m1();
//        super.m1();
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        m.show();
//    }
//}


// Code for invoking immediate parent class constructor

class A {
    A() {
        System.out.println("Class A");
    }
}

class Main extends A {
    Main(){
        super();
        System.out.println("Class B");
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}