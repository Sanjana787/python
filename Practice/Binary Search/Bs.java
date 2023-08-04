/**Program to perform binary search on Array 1D**/
import java.util.*;
class Bs{
   public static int bsearch(int a[],int k){
    int mid,high=a.length-1,low=0;
     while(low<=high){
        mid=(high+low)/2;
     if(a[mid]==k){
        return mid;
     }else if(a[mid]<k){
      low=mid+1;
     }else if(a[mid]>k){
       high=mid-1;
     }
     }
     return -1;
   }
    public static void main(String[] args) {
         int size,k,ans;
        Scanner sc=new Scanner(System.in);
      
        System.out.print("enter size of array");
        size=sc.nextInt();
        int arr[]=new int [size];
        System.out.println("enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter target element:");
         k=sc.nextInt();
         ans=bsearch(arr,k);
         if(ans==-1){
            System.out.println("Element do not present !!");
         }  else{
            System.out.println("Element present at:"+ ++ans);
         }
    }
}