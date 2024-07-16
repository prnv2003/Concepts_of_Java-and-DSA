
public class RecursionBL {

    // Q1. Print numbers from 5 to 1.

    // public static void printNum(int n) {
    // if (n == 0) {
    // return;
    // } // Base Condition
    // System.out.println(n); // Print
    // printNum(n - 1); // recursion
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // printNum(n);
    // }

    // Q2. Print numbers from 1 to 5.

    public static void printNum(int n) {
        if (n == 6) {
            return; // Base Condition
        }
        System.out.println(n); // Print
        printNum(n + 1); // recursion
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }

}