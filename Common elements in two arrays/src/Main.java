import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {4,3,7,8,2};
        int arr2[] = {5,1,4,4,3};

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    hs.add(arr1[i]);
                    break;
                }
            }
        }
        for(int n : hs){
            System.out.print(n + " ");
        }
    }
}