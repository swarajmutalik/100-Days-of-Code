public class Main {
    public void eat(){
        System.out.println("I am eating");
    }
    public void run(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Hello World");
        m.eat();
        m.run();
    }
}