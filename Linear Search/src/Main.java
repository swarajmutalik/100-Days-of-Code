public class Main {
    public static void main(String[] args) {
        int a[] = {5, 3, 1, 6, 4, 2};
        int item = 1;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                System.out.println("element is present at " + i + " index position");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Item is not present in the list");
        }
    }
}