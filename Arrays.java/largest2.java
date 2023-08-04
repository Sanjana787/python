// package Arrays.java;
import java.util.*;

public class largest2 {
    public static void fun(int n,int m,int a[][]) {
         int i=n,j=m,k;
        while( i==n){
              for( k=0;k<m;k++){
                a[i][k]=0;
              }
              i++;
        }
        while( j==m){
                for(k=0;k<n;k++){
                    a[k][j]=0;
                }
        }
        j++;
        for( i=0;i<n;i++){
            for( j=0;j<m;j++){
              System.out.println("ooutput is::"+a[i][j]);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns of array::");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("enter array elements::");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 a[i][j]=sc.nextInt();
                }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    fun(i,j,a);
                }
            }
        }
        
    }
}
