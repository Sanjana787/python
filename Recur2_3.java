public class Recur2_3 {
    static void sum(int i,int n){
     if(i<1){
      System.out.println(n);
     return;
     }
     sum(i-1,n+i);

    }
    static int Sum(int n){
       if(n==0){
        return 0;
       }
       return n+Sum(n-1);
    }
    public static void main(String[] args) {
        sum(5,0);
        int j=0;
        j=Sum(10);
         System.out.println(j);
    }
}
