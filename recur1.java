public class recur1 {
    static void recu(){
    String name="Sanjana";
    int c=0;
    if(c==5){
      return;
    }
    System.out.print(name);
    recu();
    c++;
    
}
    public static void main(String[] args) {
        
        recu();
    }
}
