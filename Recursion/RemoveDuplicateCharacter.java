package Recursion;

public class RemoveDuplicateCharacter {
    
    public static String removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            return newStr.toString();
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            return removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            return removeDuplicate(str, idx + 1, newStr, map);
        }
    }
    public static void main(String[] args) {
        String str = "ravikaran";
        System.out.println(removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]));
    }
}
