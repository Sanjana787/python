import java.util.*;

public class Arrays2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns of the matrix::");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int a[][] = new int[rows][cols];
        System.out.println("enter array elements::");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        System.out.println("Entered array::");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter element to be searched::");
        int ele = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (ele == a[i][j]) {
                    System.out.println("element present at row:" + i + " column " + j + " \nposition=" + (i * j));
                }
            }
        }
    }
}
