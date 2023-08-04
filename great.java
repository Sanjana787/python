import java.util.*;
public class great{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("enter first number");
      int a=sc.nextInt();
      System.out.print("enter second number");
      int b=sc.nextInt();
      if(a>b){
        System.out.print("first number is greater then second number");
      }
      else
      if(a<b){
        System.out.print(" second number is greater then first number");
      }
      else {
        System.out.print("first number is equal to second number");
      }
    }
}
