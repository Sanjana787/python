import java.util.*;
public class avg {
    public static double average(int a,int b,int c){
          double aver=((a+b+c)/3);
          return aver;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three numbers ::");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    double x=average(a,b,c);
    System.out.println("average of "+a+" , "+b+" , "+" and "+c+" is "+x);
    }
}
