public class Main {
    static void display(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        display();
        A.show();
    }
}

class A {
    static void show(){
        System.out.println("2");
    }
}