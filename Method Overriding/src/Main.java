 class Test{
         void show(){
         System.out.println("1");
         }
}
class Main extends Test {
    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.show();
    }
}