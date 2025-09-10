package My_DSA_Journey.String;

public class Valid_Palindrome {
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        //.replaceAll --> this string method removes all non-alphanumeric char(space ' ', comma ',', colon ':')

        int str = 0;
        int end = s.length() - 1;

        while (str < end) {
            if (s.charAt(str) != s.charAt(end)) {
                return false;
            }
            str++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama"; //true
//        String s = "race a car"; //false
        System.out.println(isPalindrome((s)));
    }
}
