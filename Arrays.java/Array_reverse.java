import java.util.*;
import java.util.Arrays;
public class Array_reverse{
     static void reverse(int []a){
        int start=0;
        int end=a.length-1;
        int temp;
      for( int i=0;i<(a.length)/2;i++){
        temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
      }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int []arr=new int [sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            System.out.print(Arrays.toString(arr));
        reverse(arr);

        System.out.println("\nreversed list::");
        System.out.print(Arrays.toString(arr));
    }
}
