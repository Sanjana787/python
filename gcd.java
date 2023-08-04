import java.util.*;
public class gcd {
    public static int hcf(int a,int b){
        int i=1;
        int h=1;
        for(i=1;i<a&&i<b;i++){
            if(a%i==0 && b%i==0){
             h=i;
            
            }
        }  
        
        return h;  
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter two numbers::");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int n= hcf(a,b);
      System.out.print(n);
    }
}
