import java.util.*;
public class fibbo {
    
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number of terms to be displayed of fibbonacci series::");
           int n=sc.nextInt();
           int a=0;
           int b=1;
           System.err.println("fibonnacci series:");
           System.out.println(a+"\n"+b);
           if(n>1){
           for(int i=2;i<=n;i++){
            int c=a+b;
                 a=b;
                 b=c;
             System.out.println(b);
           }
        }
    }
}
