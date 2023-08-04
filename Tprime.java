import java.util.*;
public class Tprime {
    static int fun(int j){
        if(j==1){
                return 0;
            }
           for(int i=2;i<=Math.sqrt(j);i++){
            
             if(j%i==0){
                return 0;
             }
           }
           return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range ::");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int k;
         for(int j=start;j<=end;j++){
            k=fun(j);
            if(k==1){
                System.out.print(j+" ");
            }
    }}
}
