public class String1 {
    public static void main(String[] args) {
        String s="CDA";
        int res=0;
        for(int i=0;i<s.length();i++){
            res*=26;
            res+=s.charAt(i)-'A'+1;
            System.out.println(s.charAt(i)-'A');
        }
        System.out.println("res "+res);
        System.out.println('B'-'A');
    }
}
