import java.util.*;
public class fsum {
    public static int sum(int a,int b){       
        return a+b;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter first number:");
       int a=sc.nextInt();
       System.out.print("Enter second number:");
       int b=sc.nextInt();
       int s=sum(a,b);
       System.out.println("sum of "+a+" and "+b+" is "+s);
    }
}
