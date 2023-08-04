import java.util.*;
public class str{
    public static void main(String args[]){
        int out=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array::");
        int size=sc.nextInt();
        System.out.println("enter array elements::");
        String aos[]=new String[size];
        int len;
        for(int i=0;i<size;i++){
            aos[i]=sc.nextLine();
        }
        for(int i=0;i<aos.length;i++){
         System.out.println(i+" "+aos[i]);
         out+=aos[i].length();
        }
    }
}