import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class all {
	
    static int  countWords(String input) {
        int count=0,len=input.length();
        for(int i=0;i<len;i++){
            if(input.charAt(i)==' '){
                count++;
            }
                    // System.out.println(i+" "+input.charAt(i));
        }
        return count+1;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}


