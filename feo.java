import java.util.*;
public class feo {
    public static void Even_Odd(int n){
        if(n==1||n==0){
            System.out.println("the number is neither odd nor even!");
        }
       else if(n%2==0){
        System.out.println(" number is even!");
       }
       else{
        System.out.println("number is odd!");
       }
       return;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number::");
      int n=sc.nextInt();
      Even_Odd(n);
    }
}
