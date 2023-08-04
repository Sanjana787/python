public class Palindromic_String {
    static boolean fun(String s) {
        int j=s.length()-1;
        char c;
        
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=s.charAt(j))
        return false;
        j--;
     }
     return true;
    }
    public static void main(String[] args) {
        boolean d;
       d= fun("RAMAR");
       System.out.println(d);
       System.out.println(2/2);
    }
}
