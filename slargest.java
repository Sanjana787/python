import java.util.*;
public class slargest {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array:");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter array elements::");
      for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      int small=arr[0];
        int ssmall=arr[0];
      for(int i=1;i<size;i++){
       if(small>arr[i]){
            small=arr[i];
        }
      }
      for(int i=0;i<size;i++){
          if(ssmall<arr[i] && ssmall>=small){
            ssmall=arr[i];
          }
      }
      System.out.println(small+" "+ssmall );
    }
}
