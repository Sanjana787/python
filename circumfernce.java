import java.util.*;
public class circumfernce {
    static final float pi=3.14F;
    public static float circumference(int r){
        float c=(2*pi*r);
        return c;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter radius of circle:");
     int r=sc.nextInt();
     float c=circumference(r);
     System.out.println("circumference of circle with radius "+r+" : "+c);
    }
}
