abstract class Main {
    abstract void start();
}

class Car extends Main {
    void start(){
        System.out.println("Starts with key");
    }
}

class Scooter extends Main {
    void start(){
        System.out.println("Starts with kick");
    }

    public static void main(String[] args) {
//        Main m = new Main();
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}