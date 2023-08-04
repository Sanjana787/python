import java.util.*;
public class sw {
    public static void main(String args[]){
        System.out.println("1.Hello\n2.Namaste\n3.Bonjour");
        System.out.println("enter your choice::");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
      switch(a){
        case 1: System.out.println("Hello!");
        break;
        case 2: System.out.println("Namaste!");
        break;
        case 3:System.out.println("Bonjour!");
        break;
        default:System.out.println("Invalid Input");
        }
    //    if(a==1){
    //     System.out.println("Hello!");
    //    }else if(a==2){
    //     System.out.println("Namaste!");
    //    }else if(a==3){
    //     System.out.println("Bonjour!");
    //    }
    }
}
