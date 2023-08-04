//package Arrays.java.util;
import java.util.*;
public class array_1d{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of array::");
        n=sc.nextInt();
        int []marks={12,13,14,15,11};

        // int marks[]=new int[n] ;
        // System.out.println("enter array elements:");
        // for(int i=0;i<n;i++){
        //     marks[i]=sc.nextInt();
        // }
        System.out.println("entered array elements are ::");
        for(int i=0;i<5;i++){
           System.out.println(marks[i]); 
        }
        

    }
}
