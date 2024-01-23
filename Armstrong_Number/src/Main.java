public class Main {
    public static void main(String[] args) {
        int num = 153;
        int t1 = num;
        int leng = 0;
        while(t1 != 0){
            t1 = t1 / 10;
            leng = leng + 1;
        }
        int t2 = num;
        int arms = 0;
        while(t2 != 0){
            int mul = 1;
            int rem = t2 % 10;
            for(int i = 1; i<= leng; i++){
                mul = mul*rem;
            }
            arms = arms + mul;
            t2 = t2 / 10;
        }
        if(arms == num){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}