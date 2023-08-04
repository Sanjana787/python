import java.util.Scanner;
public class Bsearch {
    public static int BS(int a[],int n,int ele){
       int high=a.length-1;
       int low=0;
       int mid;
       while(high>=low){
       mid=(high+low)/2;
       if(a[mid]==ele){
        return mid;
       }
       else if(a[mid]>ele){
        high=mid-1;
       }else{
        low=mid+1;
       }}
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter size of array:");
          int n=sc.nextInt();
          int arr[]=new int[n];
          System.out.println("Enter array elements::");
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          System.out.println("enter element to be searched ::");
          int ele=sc.nextInt();
       int ans= BS(arr,n,ele);
       if(ans==-1){
        System.out.println("element not found");
       }else{
        System.out.println("element present at "+(ans+1));
       }
    }
}
