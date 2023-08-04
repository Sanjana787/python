import java.util.*;
public class new_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    m=1;
                }
                else{
                    m=0;
                }
                System.out.print(m+" ");

            }
System.out.println(" ");
        }
    }
}
