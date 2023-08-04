import java.util.*;
public class greatest {
    public static void great(int a,int b){
        if(a==b){
            System.out.println("the two numbers is Equal!");
        }
        if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n=sc.nextInt();
        int m=sc.nextInt();
        great(n,m);

    }
}
