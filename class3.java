package TutoringClasses;

import java.io.*;
import java.util.*;

class Class3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        
    }

    /*
    source <- signal tower
    event <- broadcasted signal
    listener <- receiving device

    aButton -> source
    click -> event
    tb -> onValueChanged
    onFocus
    

    */

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
