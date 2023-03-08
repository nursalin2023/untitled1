public class Main {
    public static void main(String[] args) {
        int []nur = new int[100];

        for (int i = 0; i <= nur.length; i++) {

        }
    }
    public static void minimum ( int[]a){
        int san = a.length; ;
        for (int i = 0; i < a.length; i++) {
           if (san > a[i]){
               san = a[i];

           }
        }
        System.out.println(san);
    }
    public static void maxsimum (int[]mini){
        int san = 0 ;
        for (int i = 1; i < mini.length; i++) {
            if (san < mini[i]){
                san=mini[i];
            }
        }
        System.out.println(san);
    }
    public  static int summa (int[]aa){
        
    }
}