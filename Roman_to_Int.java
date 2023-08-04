import java.util.*;
public class Roman_to_Int {
    static int roman(char s){
        int ans=0;
       switch(s){
        case 'I': ans=1;
                  break;
        case 'V': ans=5;
        break;
        case 'X': ans=10;
        break;
        case 'L': ans=50;
        break;
        case 'C': ans=100;
        break;
        case 'D': ans=500;
        break;
        case 'M': ans=1000;
        break;
       }
       return ans;
    } 
    public static void main(String[] args) {
      System.out.println("Enter a String");
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      System.out.println(str);
      int sum=0,d,r;
      for(int i=0;i<str.length();i++){
        if(i==str.length()-1)
        {
          d=roman(str.charAt(i));
          r=0;
        }
        else{
            d=roman(str.charAt(i));
            r=roman(str.charAt(i+1));
        }
        
        if(d>=r){
            sum+=d;
        }else{
            sum-=d;
        }
      }
      System.out.println(sum);
    }
}
