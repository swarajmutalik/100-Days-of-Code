interface I1 {
    void show();
}

class Main implements I1{
    public void show(){
        System.out.println("1");
    }

    public static void main(String[] args) {
//        I1  i = new I1();
        Main m = new Main();
        m.show();
    }
}