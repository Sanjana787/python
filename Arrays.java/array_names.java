//package Arrays.java;
import java.util.*;

public class array_names {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter number of names to be entered ::");
        // int n=sc.nextInt();
        String name[]=new String[4];
        // name[0]="sa";
        // name[1]="re";
        // name[2]="ga";
        // name[3]="ma";
        // for(int i=0;i<n;i++){
        //     name[i]=sc.nextLine();
        // }
          System.out.println("entered names::");
          for(int i=0;i<name.length;i++){
            System.out.println("name:: "+"("+i+")"+name[i]);
          }
        }
}
