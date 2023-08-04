public class recur3_2 {
    
    static void rev(int i,int n,int arr[]){
        if(i>=n/2)
        return;
        int temp; 
        temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        rev(i+1,n-1-i,arr);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            System.out.print(i+" ");
        }
        rev(0,arr.length,arr);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
