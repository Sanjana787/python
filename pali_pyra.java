public class pali_pyra {
    public static void main(String args[]){
        int m=0;
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("_");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);     
                }
            for(m=2;m<=i;m++){
                System.out.print(m); 
            }
            System.out.println();
        }
    }
}
