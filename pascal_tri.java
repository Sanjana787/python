import java.util.*;

public class pascal_tri {
    public static int value(int n, int r) {
        int result = 1;
        for (int i = 0; i < r; i++) {
          {
            result = (n - i) * result;
            result /= (i + 1);
          }
        }
        // System.out.print(result + " \n");
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n and r :");
        int n = sc.nextInt();
        int r = sc.nextInt();

        

            // else if(n==r+1){
            // System.out.println(n);
            // }
            
                System.out.println("OUTPUT IS:");

                for (int j = 0; j <= n; j++) {
                    int res = value(n, j);
                    System.out.print(res + "  ");
                }
            }
        
    }
