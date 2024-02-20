// Code for invoking the current class instance variable

//class Test {
//    int i;
//    void setValue(int i){
//        this.i = i;
//    }
//
//    void show(){
//        System.out.println(i);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.setValue(10);
//        t.show();
//    }
//}

// Code for invoking current class method

//class ThisDemo {
//    void display() {
//        System.out.println("Hello");
//    }
//
//    void show() {
//        this.display();
//    }
//
//    public static void main(String[] args) {
//        ThisDemo t = new ThisDemo();
//        t.show();
//    }
//}

//Code for invoking current class constructor

//class Demo{
//    Demo(){
//        this(10);
//        System.out.println("no arg constructor");
//    }
//
//    Demo(int a){
//        System.out.println("Parameterized constructor");
//    }
//
//    public static void main(String[] args) {
//        Demo d = new Demo();
//    }
//}

// Code for passing this keyword as an argument in a method call

class Demo{

    void m1(Demo d){
        System.out.println("Inside the method");
    }

    void m2(){
        m1(this);
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.m2();
    }
}
