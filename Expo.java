import java.util.*;
public class Expo { 
    static int fun(int pow,int base){
        int ans=1;
    if(pow==0||base==0){
        return 1;
    }else if(pow<0){
        base=(1/base);
        while(pow!=0){
            ans*=base;
            pow++;
        }
        return ans;
    }else if(pow>0){
        while(pow!=0){
        ans*=base;
        pow--;
        }
        return ans;
    }
    return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pow,base,ans;
        pow=sc.nextInt();
        base=sc.nextInt();
        ans=fun(pow,base);
        System.out.println(ans);
    }
}
