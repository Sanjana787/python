import java.util.*;
import java.util.Arrays;

//Program to create array list from String.  

public class String_Array {
    
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
           String [] str1=str.split(" ");
           System.out.println(str.length());
           System.out.print(Arrays.toString(str1));
           for(int i=0;i<str1.length;i++){
            System.out.print(str1[i]+" ");
           }
        //   StringBuilder sb=new StringBuilder("Programming");
        //   System.out.println("Enter String::");
        //   String str1=str+sb;
        //   String str=" Hello there!!";
        //   sb.append(str);
        //   System.out.println(sb);
        //    Mymethod(sb.toString());
    }
}
