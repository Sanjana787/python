import java.util.*;
public class prime {
    public static int pr(int n,int m){
   long flag=0,j;
   for( j=n;j<=m;j++){
   // System.out.print(j+"    ");
        for(int i=2;i<=Math.sqrt(j);i++){
          //  System.out.print(j+"  "+Math.sqrt(j));
            if(j%i!=0){
                flag=1;
                System.out.println(j);
                break;
            }
        } 
    }
    //System.out.println(j); 
     return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter range ::");
         int n=sc.nextInt();
         int m=sc.nextInt();
         int s= pr(n,m);
        //  if(s==0){
        //     System.out.println(n+" is a prime number!");
        //  }
        //  else{
        //     System.out.println(n+" is not a prime number!");
        //  }
        //  System.out.println(Math.sqrt(n));
    }
}
