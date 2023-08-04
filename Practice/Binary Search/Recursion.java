/**Binary search using recursion**/
import java.util.*;
public class Recursion {
   public static int recurr(int a[],int low,int high,int target){
    int mid;
      if(low>high){
        return -1;
      }
      mid=(low+high)/2;
      if(a[mid]==target){
        return mid;
      }else if(a[mid]<target){
       return recurr(a,mid+1,high,target);
      }else if(a[mid]>target){
      return recurr(a,low,mid-1,target);
      }
     return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={3,5,7,8,10,15,20};
        int k,ans;
        System.out.println("Enter target element::");
        k=sc.nextInt();
        ans=recurr(a,0,(a.length-1),k);
        if(ans==-1){
            System.out.print("Element do not present !!");
        }else{
            System.out.print("Element present at :"+ ++ans);
        }
    }
}
