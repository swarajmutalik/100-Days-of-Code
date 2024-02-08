public class Main {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {40,50,60,70,80};

        int a_length = a.length;
        int b_length = b.length;
        int c_length = a_length + b_length;

        int c[]  = new int[c_length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int j = 0; j < b.length; j++){
            c[a.length + j] = b[j];
        }
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
    }
}