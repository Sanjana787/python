import java.util.Arrays;
import java.util.Scanner;
 public class UandLbound {
   public static int fun(int a[],int k,int n){
     int low=0,high=n-1,mid=-1;
       while(low<=high){
          mid=(low+high)/2;
         if(a[mid]==k){
            return mid;
         }else if(a[mid]<k){
            low=high+1;
         }else if(a[mid]>k){
            high=mid-1;
         }
      }
      return mid;
}
    public static void main(String []args) {
        int n,k,lb,ub;
        Scanner sc=new Scanner(System.in);
        int arr[]={12,34,56,78,90,210};
        n=arr.length;
        System.out.println("Enter target element to find the upper and lower bound of that element::");
        k=sc.nextInt();
        lb=fun(arr,k,n);
        System.out.println("lower bound::"+lb);
        if(lb<n-1){
           ub=lb+1;
            System.out.print("upper bound ::"+ub);
        }else{
            System.out.print("upper bound don't exist!");
        }
    }
}
