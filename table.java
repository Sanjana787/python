import java.util.*;
public class table {
    public static void main(String args[])
    {
        final int n=10;
        final String name="Sanjana";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ::");
        int a=sc.nextInt();
        System.out.println("TABLE::");
        
        for(int i=1;i <=n;i++)
        {
            System.out.println(a*i);
        }
        
    }
}
