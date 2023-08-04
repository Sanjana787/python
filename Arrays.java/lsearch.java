//package Arrays.java;
import java.util.*;
public class lsearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        String name[]=new String[size];
        System.out.println("enter names::");
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        
        for(int i=0;i<name.length;i++){
           
                System.out.println("element entered at:"+i+"position in array is:"+name[i]);
         
           
            
         }
        System.out.println("enter name to be searched::");
        String find=sc.next();
        for(int i=0;i<name.length;i++){
            if(name[i]==find){
                System.out.println("element present at :"+i+"position in array");
                break;
            }
            
         }
    //      int n[]=new int[size];
    //      System.out.println("enter names::");
    //      for(int i=0;i<size;i++){
    //          n[i]=sc.nextInt();
    //      }
    //      System.out.println("enter name to be searched::");
    //      int find=sc.nextInt();
    //      for(int i=0;i<n.length;i++){
    //          if(n[i]==find){
    //              System.out.println("element present at :"+(i+1)+"position in array");
    //              break;
    //          }
    // }
    }
}
