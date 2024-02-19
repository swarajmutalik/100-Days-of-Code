class Test {
    int i;
    void setValue(int i){
        this.i = i;
    }

    void show(){
        System.out.println(i);
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(10);
        t.show();
    }
}