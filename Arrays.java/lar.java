//package Arrays.java;
import java.util.*;
public class lar {
    public static int lar(int[] a,int n){
        int ans=0;
        for(int i=0;i<n-1;i++){
            
         if(ans<=a[i+1]){
            ans=a[i+1];
         }     
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size::");
         int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ans=lar(arr,n);
         System.out.println("largest::"+ans);
    }
}
