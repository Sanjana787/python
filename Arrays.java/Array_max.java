import java.util.*;
public class Array_max {
    static void max(int[]a) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(m<a[i]){
                int temp=m;
                m=a[i];
                a[i]=temp;
            }
        }
        System.out.println("MAXIMUM VALUE IS::"+m);
     }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []arr=new int[sc.nextInt()];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println();
    System.out.println(Arrays.toString(arr));
    max(arr);
}
}
