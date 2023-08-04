import java.util.*;
public class Split_string {
    static String split(String str){
        String sub1="",sub2="";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<(str.length()-1)/2;i++){
          sub1+=sb.append(i);
        }
        for(int i=(str.length()-1)/2;i<str.length();i++){
          sub2+=sb.append(i);
        }
        
    }
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        split(str);
        

    }
    
}
