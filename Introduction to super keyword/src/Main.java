class A {
    int a = 10;
}

class Main extends A {

    int a = 20;
    void show(int i){
//        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String[] args) {
      Main m = new Main();
      m.show(30);
    }
}