class recur2 {
    static void  fun(int i){
     if(i<1)
      return;
      fun(i-1);
       System.out.println(i);
    } 
    public static void main(String[] args) {
        int n=10;
         fun(n);
    }
}
