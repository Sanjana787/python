import java.util.*;
import java.util.Arrays;
public class spiralarray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        int i;
        //    for(int i=0;i<n;i++){
        //        for(int j=0;j<n;j++){
        //             System.out.print("*"+i+j);
        //        }System.out.println();
        //    }
        int left=0,right=n,top=0,down=n;
        while(top<=down && left<=right){
        for( i=left;i>=right;i++){
            arr[top][i]=sc.nextInt();
        }top++;
         for( i=left;i>=down;i++){
            arr[i][right]=sc.nextInt();
        }right--;
         for( i=right;i>=left;i--){
            arr[down][i]=sc.nextInt();
        }down--;
         for( i=down;i>=left;i--){
            arr[i][left]=sc.nextInt();
        }left++;
    }}
}
