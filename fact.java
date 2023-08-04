import java.util.*;
public class fact{
    public static int factorial(int n){
        if(n<0){
            System.out.println("invalid input!");
            return 0;
        }
        if(n==1||n==0){
            return 1;
        }
        else
      return n*factorial(n-1);
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number to calculate factorial:");
       int n=sc.nextInt();
       System.out.println("factorial of "+n+" is "+factorial(n));
    }
}