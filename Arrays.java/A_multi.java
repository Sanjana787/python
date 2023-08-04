import java.util.*;
import java.util.Arrays;
public class A_multi {
    // static void Array(int [][]a){
    //     a[1][1]=15;
    //     a[1][0]=21;
    // }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println("enter size array::");
        // int [][]arr=new int[3][2];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //    System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    //    int [][]arr={{1,2,3,9},{5,6,7},{4,5,6,7,8}};
    int [][]arr=new int[3][4];
    for(int i=0;i<3;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }System.out.println();
      }
      for(int i=0;i<3;i++){
        // for(int j=0;j<arr[i].length;j++){
        //     System.out.print(arr[i][j]+" ");
        // }System.out.println();
        System.out.println(Arrays.toString(arr[i]));
        System.out.println();
      }
    }
}
