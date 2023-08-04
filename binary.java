import java.util.*;
public class binary {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int na=0;
        while(num>0){
            na=na+num%2;
            num=num/2;
        }      
            System.out.println(na);
    }
}
