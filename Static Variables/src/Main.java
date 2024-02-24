public class Main {
    int emp_id;
    String name;
    static String company = "SP";

    Main(int emp_id,String name){
        this.emp_id = emp_id;
        this.name = name;
    }

    void display() {
        System.out.println(emp_id + " " + name + " " + company);
    }

    public static void main(String[] args) {
        Main m = new Main(101,"Amit");
        m.display();
        Main m1 = new Main(102,"Sumit");
        m1.display();
    }
}