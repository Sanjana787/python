import java.util.Arrays;
 class Binary_Exponentiation{
 public static double mypow(double x,int n){
    if(n==0)return 1;
    if(n==-1)return (1/x);
    double temp=mypow(x,n/2);
    if(n%2==0)return temp*temp;
    if(n>0)return temp*temp*x;
    return temp*temp*(1/x);
}
    public static void main(String[] args) {
      int[][]a=new int[2][2];
       int n=3;
        int [] []arr={{1,1},{1,0}};
        a==mypow(arr,n);
        System.out.println(a);
    }
 }


