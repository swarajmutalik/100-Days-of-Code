class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

public class Main extends Animal {
    public static void main(String[] args) {
        Main m = new Main();
        m.eat();
    }
}