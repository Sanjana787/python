import java.util.*;
public class si {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        float r=sc.nextInt();
        int t=sc.nextInt();
        int si=Math.round((p*r)*t/100);
        System.out.println(si);
    }
}
