import java.util.*;
public class lexicographical {
    public static void Strings(String str){
        
         for(int i=0;i<str.length();i++){
            StringBuffer sb=new StringBuffer();
            for(int j=i;j<str.length();j++){
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
         }
    }
       public static void main(String args[]){
              Scanner sc= new Scanner(System.in);
              System.out.println("enter string::");
              String str= sc.nextLine();
              Strings(str);
       }
}
