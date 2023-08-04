import java.util.Arrays;
import java.util.*;
public class sort {
    public static void main(String args[]){
       
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("entered array elements:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
          }
          Arrays.sort(arr);
          System.out.println("sorted array:");
          for(int i=0;i<n;i++){
            System.out.println(arr[i]);;
          }
    }
   

}
