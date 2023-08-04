public class rh {
    public static void main(String args[]) {
        int n = 5;
         //outer loop for iteration 
        for (int i = 1; i <= 5; i++) {

            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
