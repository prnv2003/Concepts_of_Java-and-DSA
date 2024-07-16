public class RecursionIL5 {

    // Q5. Move all ‘x’ to the end of the string. - O(n)

    public static void moveAllX(int idx, String str, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(idx + 1, str, count, newString);
        } else {
            newString += currChar;
            moveAllX(idx + 1, str, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(0, str, 0, "");
    }

}
