
import java.io.*;
import java.util.*;

class Template {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // println(allDigits("str"));
        // println(allDigits("1234"));
        println(allDigits("12a4"));

        println(longestWord("abc ab abcde "));
        println(gcd(24, 36));
        primeNums(11);

    }

    // abc ab abcde
    // Q2
    public static String longestWord(String str) {
        String longestWord = "";
        int curLength = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (curLength > longestWord.length()) {
                    longestWord = str.substring(i - curLength, i); // substring(0,3)
                }
                curLength = 0;
            } else {
                curLength++;
            }
        }
        if (curLength > longestWord.length()) {
            longestWord = str.substring(str.length() - curLength); // substring(0,3)
        }
        return longestWord;
    }

    // Grade 12: Euclidean Algorithm
    // Q4
    public static int gcd(int a, int b) {
        int gcd = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Q5
    public static void primeNums(int num) {
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // 16
    // 31
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ab abc
    // abc  ab
    // "abcd"
    // "abcd".charAt(1) -> 'b'
    // 'A' < 'B', ASCII
    // 'A' < 'a'
    // 012a
    // a0123
    // Q1
    public static boolean allDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }

        }
        return true;
    }

    public static void println() {
        System.out.println();
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void printArr(Object[] arr) {
        for (Object obj : arr) {
            print(obj + " ");
        }
        println();
    }

    public static void print2DArr(Object[][] arr) {
        for (Object[] subArr : arr) {
            printArr(subArr);
        }
    }
}
