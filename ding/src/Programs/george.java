package Programs;
import java.util.*;
public class george {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        String number = s.next();
        //array creation and initializing the array with string elemnts
        int[] digitarray = new int[number.length()];
        for(int i=0;i<number.length();i++) {
            digitarray[i] = number.charAt(i) - '0';
        }
        s.close();
        //printing the array elements
        System.out.print("the digits are\t");
        for(int digits : digitarray) {System.out.print(digits+" ");}
        System.out.println();
        //counting the number of digits
        int count=0;
        int i=0;
        for(i=0;i<digitarray.length;i++) {
            if(i<digitarray.length-1&&digitarray[i]==0 && digitarray[i+1]==0 ) {
                count+=1;
                i++;
                System.out.println(count);}
            else{
                count+=1;
                System.out.println(count);
            }
        }
        System.out.println("\ncount"+count);
    }
}
