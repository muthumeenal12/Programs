package ding;
import java.util.Scanner;

public class numericString {

    public static int no_of_keys(String tar_num){
   
       
        int count=0 ;
        long currentValue=0 ;
        for (int i = 0; i < tar_num.length(); i++) {
            char digit = tar_num.charAt(i);
            if (i < tar_num.length() - 1 && digit == '0' && tar_num.charAt(i + 1) == '0') {
                currentValue *= 100;
                i++; 
                
            } else {
                currentValue = currentValue * 10 + Character.getNumericValue(digit);
            }
            count++;
        }
            return count;
    }
       

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number:");
        String tar_num =s.nextLine();
        int count = no_of_keys(tar_num);
        System.out.println("Number of keys:"+count);
       

    }
}