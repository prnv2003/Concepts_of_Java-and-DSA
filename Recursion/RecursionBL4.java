public class RecursionBL4 {

    // Q6. Print x^n (with stack height = n)

    public static int calcPower(int x, int n) {
        if (n == 0) { // base cond 1
            return 1;
        }
        if (x == 0) { // base cond 2
            return 0;
        }
        int xPownm1 = calcPower(x, n - 1); // kaam
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }

}
