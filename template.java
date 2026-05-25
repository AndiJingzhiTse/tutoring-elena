
import java.io.*;
import java.util.*;

class Class {

    public static void main(String[] args) throws IOException {
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

    public static void printArr(int[] arr) {
        for (int obj : arr) {
            print(obj + " ");
        }
        println();
    }

    public static void print2DArr(Object[][] arr) {
        for (Object[] subArr : arr) {
            printArr(subArr);
        }
    }

    public static void print2DArr(int[][] arr) {
        for (int[] subArr : arr) {
            printArr(subArr);
        }
    }
}
