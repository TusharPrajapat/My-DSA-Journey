package My_DSA_Journey.D_String;

import java.util.Scanner;

public class A_Check_String_Palindrome {
    public static boolean Checking_Palindrome(String letter) {
        int n = letter.length();
        for (int i = 0; i <= n / 2; i++) {
            if (letter.charAt(i) != letter.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = "racecar";
        boolean condition = Checking_Palindrome(letter);
        if (condition) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
