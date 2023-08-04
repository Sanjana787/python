//program to find out the maximum frequency element in array
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
class Maxfreq{
    public static void Count(int arr[],int n){
            HashMap <Integer,Integer>result=new HashMap<>();
            for(int i=0;i<n;i++){
                if(result.containsKey(arr[i])){
                    result.put(arr[i], result.get(arr[i])+1);
                }
                else{
                    result.put(arr[i],1);
                }
            }
            for(Map.Entry<Integer,Integer>i:result.entrySet()){
                System.out.println(i.getKey()+" "+i.getValue());
            }
            System.out.println("Maximum frequency element is:");

             for(Map.Entry<Integer,Integer>i:result.entrySet()){
                System.out.println(i.getValue());
            }
         
    } 
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Count(arr,n);
    }
}