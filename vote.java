import java.util.*;
public class vote {
    public static void voter(int age){
        if(age>=18){
            System.out.println("Congratulations!!\n you are eligible for voting.");
        }
        else{
            System.out.println("Sorry!!\n you are not eligible for voting.");
        }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age::");
    int age=sc.nextInt();
    voter(age);
    }
}
