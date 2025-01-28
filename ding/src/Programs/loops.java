package Programs;
import java.util.Scanner;
public class loops {
    public static void reverse(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the last number for reversing\t");
        int input = s.nextInt();
        for(int i=input;i>=0;i--){
            System.out.println(i);
        }s.close();
    }
    public static boolean isLowercase(char input) {
        return Character.isLowerCase(input);
    }
    public static void ascii(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter Whether Lowercase/Upper case A:::a\t");
        char input = s.next().charAt(0);
        boolean res= isLowercase(input);
        String temp=Boolean.toString(res);
        switch (temp) {
            case "true":{
            char start = 'a';
            char end = 'z';
            generate(start, end);
                break;}
            default:{
            char start = 'A';
            char end = 'Z';
            generate(start, end);
                break;}
        }
        s.close();
    }
    public static void generate(char a, char b){
        for (char c = a; c <= b; c++) {
            System.out.println("ASCII value of " + c + " is: " + (int) c);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the option number to perform\n 1.reverse number\n 2.ascii printing\n");
        Scanner s = new Scanner(System.in);
        char input = s.next().charAt(0);
        switch (input) {
            case '1':
                reverse();
                break;
            case '2':
                ascii();
                break;
            default:
                System.out.println("invalid input");
                break;
        }s.close();
    }
}

