import java.util.*;
public class UserWish {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int zero=0,positive=0,negative=0;
        String f;
        
        do{
            System.out.println("enter number :");
            int in=sc.nextInt();
            if(in==0){
              zero+=1;
            }
            else if(in>0){
                positive+=1;
            }
            else {
                negative+=1;
            }
            System.out.println("Wanna enter more numbers \n Enter your choice :(yes:y/no:n)");
            f=sc.next();;
            
        }while(f!="n"||f!="N");
        System.out.println("NUMBER OF :\n Zeroes: "+zero+"\n Positive Numbers: "+positive+"\n Negative Numbers : "+ negative);
    }
}
