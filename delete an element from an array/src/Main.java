public class Main {
    public static void main(String[] args) {
       int a [] = {10,20,30,40,50};
       int element  = 30;
       for(int i = 0; i<a.length; i++){
           if(a[i] == element){
               for(int j = i; j < a.length - 1; j++){
                   a[j] = a[j + 1];
               }
               break;
           }
       }
       for(int i = 0; i < a.length - 1; i++){
           System.out.print(a[i] + " ");
       }
    }
}