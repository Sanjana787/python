
    import java.util.* ;

import java.io.*; 

 

class Fraction {

 

    // Complete the class

    int n1,d1,n2,d2;

 

    public Fraction(int n1, int d1, int n2, int d2){

        this.n1 = n1;

        this.d1 = d1;

        this.n2 = n2;

        this.d2 = d2;

    }

 

    public void Add(){

        n1 = (n1 * d2) + (n2 * d1);

        d1 = d1 * d2;

 

        Simplify();

    }

 

    public void Multiply(){

        n1 = n1 * n2;

        d1 = d1 * d2;

 

        Simplify(); 

    }

 

    public void Simplify(){

        int gcd = GCD(n1,d1);

 

        n1 /=gcd;

        d1 /=gcd;

 

        Print(n1, d1);

    }

 

    public int GCD(int a, int b){

        if (b==0) return a;

 

        return GCD(b, a%b);

    }

 

    public void Print(int n ,int d){

        System.out.println(n+"/"+d);

    }

}

 

class Solution {

 

    public static void main(String args[]) {

 

        // Write your code here

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = in.nextInt();

 

        Fraction f1 = new Fraction(a,b,0,0);

 

        int query = in.nextInt();

 

        while(query-- > 0){

            int choice = in.nextInt();

            int m = in.nextInt();

            int n = in.nextInt();

            f1.n2 = m;

            f1.d2 = n;

            if(choice==1){

                f1.Add();

            }else if(choice==2){

                f1.Multiply();

            }
        }
    }
}

