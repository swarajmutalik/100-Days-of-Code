// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int len = a.length;
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum += a[i];
        }
        int div = sum / len;
        System.out.print(sum + " ");
        System.out.println(div);

    }
}