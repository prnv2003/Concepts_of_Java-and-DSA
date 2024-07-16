
public class RecursionBL1 {

   /*** Q3. Print the sum of first n natural numbers. ***/

    public static void printSum(int i, int n, int sum) {
        // Base Condition
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        // Adding the Values
        sum += i;
        // print
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        printSum(1, 0100, 0);
    }

}