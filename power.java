import java.util.*;
public class power {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			// long ans=Math.round(Math.pow(a, b));
            // System.out.print(ans);
			if(b==0){
				a=1;
			}else{
                for(int i=1;i<=b;i++){
				a=a*a;
			}
			}
			System.out.println(a);
	}
}