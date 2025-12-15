public class ValidAnagramString {

    public static boolean Anagram(String str){
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
 String str= "anagram";
 Anagram(str);
 
    }
}
