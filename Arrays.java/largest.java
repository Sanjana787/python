import java.util.*;

public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
         int largest = Integer.MIN_VALUE;
        //  System.out.println(largest);
        int array[ ]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
            if( largest<array[i]){
                largest=array[i];
           }
         }
        //  for(int i=0;i<array.length;i++){
           
        //  }
         System.out.println("largest element present in the array::"+largest);

            }
    }
