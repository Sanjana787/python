
//package Arrays.java;
import java.util.*;
public class max_min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min, max;
        System.out.println("enter size of array::");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("entered elements::");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        int i = 0;
        while (i < size) {
            max = array[0];
            min = array[0];
            if (max < array[i]) {
                max = array[i];
                System.out.println("max:" + max);
            }
            if (min > array[i]) {
                min = array[i];
                System.out.println("minimum:" + min);
            }
            i++;
        }
    }
}