package hw_procedural.hw3.hw4;

public class Ex1 {
    public static void main(String[] args) {
        String s="топот";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }


}
