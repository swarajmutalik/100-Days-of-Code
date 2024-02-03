public class Main {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,6};
        int expected_elements = a.length + 1;
        int total_sum = expected_elements * (expected_elements + 1) / 2;
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println("Missing Number is " + (total_sum - sum));
    }
}