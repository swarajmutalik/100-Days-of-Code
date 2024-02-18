public class Main {
   private int emp_id;

   public void setEmp_id(int eid){
       emp_id = eid;
   }

   public int getEmp_id(){
       return emp_id;
   }
}

class Company {
    public static void main(String[] args) {
        Main m = new Main();
        m.setEmp_id(1);
        System.out.println(m.getEmp_id());
    }
}

