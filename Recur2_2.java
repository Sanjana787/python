public class Recur2_2 {
    static void fun(int n,int i){
      if(n>i){
        return;
      }
      fun(n+1,i);
      System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        fun(0,n);
    }
}
