public class PalindromString {
    public static boolean isPalindrom(String str) {
        int n = str.length();
         for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
            
         }
         return true;
    }

    public static void main(String[] args) {
        String testString = "madam is madam";
        System.out.println("Is the string \"" + testString + "\" a palindrome? " + isPalindrom(testString));    
    }
}
