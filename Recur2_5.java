public class Recur2_5 {
    static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int i=0;
        i=fact(5);
        System.out.println(i+" "+fact(10));
    }
}
