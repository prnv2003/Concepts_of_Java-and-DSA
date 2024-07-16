public class RecursionIL2 {

    // Reverse A String

    public static void revString(int idx, String str) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        revString(idx - 1, str);
    }

    public static void main(String[] args) {
        String str = "...a b c d...";
        revString(str.length() - 1, str);
    }

}
