import java.util.*;
public class total_prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n=sc.nextInt();
        int num=sc.nextInt();
        int isprime=0,count=0;
        while(n!=num){
            if(n==2){
                isprime++;
            }else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if((n%i)==0){
                        break;
                    }else{
                        isprime++;
                    }
                }
            }
            n++;
            if(isprime==1){
           count++; 
            }
        }
        System.out.println(count);
    }
}
