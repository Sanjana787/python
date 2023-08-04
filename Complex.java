class calc{
     int real,img;
     calc(){  
     }
    calc(int r,int i){
        real=r;
        img=i;
    }
    calc add(calc c1){
        c1.real=c1.real+real;
        c1.img=c1.img+img;
        return c1;
    }
    void display(){
        System.out.println(real+" + "+img+ "i");
    }
}

public class Complex {
   
    public static void main(String[] args) {
       calc c1=new calc(12, 10);
       calc c2=new calc(10, 1);
       calc c3=new calc();
       c3= c2.add(c1);
       c3.display();
    }
}
