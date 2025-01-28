package ding;


import java.util.Scanner;

public class PalindromeCount {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the inputs
        int M = scanner.nextInt();
        String S = scanner.next();
        scanner.close();
        
        // Count the total number of palindrome strings modulo M
        int result = countPalindromeModuloM(M, S);
        System.out.println(result);
    }

    public static int countPalindromeModuloM(int M, String S) {
        int length = S.length();
        char[] str = S.toCharArray();
        
        // Count number of ways to replace '?' to form a palindrome
        long count = 1;
        int mod = M;
        
        for (int i = 0; i < length / 2; i++) {
            char left = str[i];
            char right = str[length - i - 1];
            
            if (left == '?' && right == '?') {
                count = (count * 26) % mod; // 26 possibilities for both
            } else if (left == '?' || right == '?') {
                count = (count * 1) % mod;  // 1 possibility to make them equal
            } else if (left != right) {
                return 0; // Not a palindrome if the fixed characters don't match
            }
        }
        
        // If the string length is odd, handle the middle character
        if (length % 2 == 1 && str[length / 2] == '?') {
            count = (count * 26) % mod;  // 26 possibilities for middle '?'
        }
        
        return (int) count;
    }
}
