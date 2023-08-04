import java.util.*;
import java.util.Arrays;
public class A {
    static void Arrays_function(int a[]) {
        a[3]=100;
        a[5]=11;
        // ENHANCED FOR LOOP
        // for(int n:a){
        //     System.out.println(n);
        // }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array::");
        int arr[]=new int[sc.nextInt()];
        System.out.println("enter array elements::");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays_function(arr);
        System.out.println(Arrays.toString(arr));
    }
}
