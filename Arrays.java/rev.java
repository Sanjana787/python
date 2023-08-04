import java.util.*;
public class rev {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String n=sc.next();
    StringBuilder sb=new StringBuilder(n);
    for(int i=0;i<=((sb.length())/2);i++){
        int f=i;
        int b=(n.length()-1)-i;
        char  front=sb.charAt(f);
        char  back=sb.charAt(b);
       sb.setCharAt(f,back);
       sb.setCharAt(b,front);
    }
    System.out.print(sb);
   
}
}