import java.util.*;
public class calc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers::");
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println("--MENU--\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS");
        System.out.println("ENTER YOUR CHOICE::");
        int a= sc.nextInt();
        switch(a){
            case 1:System.out.println("sum is:");
                   System.out.println(x+y);
                    break;
            case 2:System.out.println("result after subtraction is:");
                   System.out.println(x-y);
                    break;
            case 3:System.out.println("result after multiplication is:");
                    System.out.println(x*y);
                     break;
            case 4:System.out.println("result after division is:");
                     System.out.println(x/y);
                      break;
            case 5:System.out.println("modulus of two numbers is:");
                      System.out.println(x%y);
                       break;
            default:System.out.println("enter valid choice!");
        }
    }
}
