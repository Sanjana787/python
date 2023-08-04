import java.util.*;
public class Nt {
    public static void main(String[] args) {
      String s="10000";
       result = Integer.toBinaryString(s);

    String[] temp = result.split(" ");

    for(int num: resultArray) {
        for(String s: temp) {
            resultArray[num] = Integer.parseInt(temp[s]);
        }
    }

    for(int num: resultArray) {
        System.out.print(num + ",");
      }
    }
}
