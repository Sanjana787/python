import java.util.*;
class if_else{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        System.out.println("can't give vote");
        else
        System.out.println("Eligible to give vote");
    }
}