public class recur2_4 {
    static void fun(int i,int n){
        if(i>=n)
        return;
        fun(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        fun(0,5);
    }
}
