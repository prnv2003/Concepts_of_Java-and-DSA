public class RecursionIL6 {

    // Q6. Remove duplicates in a string.

    public static boolean[] map = new boolean[26];

    public static void removeDuplcates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplcates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplcates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccdahh";
        removeDuplcates(str, 0, "");
    }

}
