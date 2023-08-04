import java.util.*;
public class odd {
    public static float Sum_odd(int n){
        int m=0;
      for( float i=0;i<=n;i++)
    {  
       if(i%2==0){
        m+=1;
       }       
    }
      return m*m;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      float m=Sum_odd(n);
      System.out.println("The sum of all odd numbers upto "+n+" is "+m);
    }
}
