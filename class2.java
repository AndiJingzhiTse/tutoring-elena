
import java.io.*;
import java.util.*;

class Class2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // boolean isInt; // flag
        // int n = 0;
        // // do {
        // //     print("Please enter an int: ");
        // //     String next = sc.next();
        // //     isInt = true;
        // //     try {
        // //         n = Integer.parseInt(next);
        // //     } catch (NumberFormatException e) {
        // //         isInt = false;
        // //     }
        // // } while (!isInt);

        // print("Please enter an int: ");
        // while (!sc.hasNextInt()) {
        //     sc.nextLine();
        //     print("Please enter an int: ");
        // }
        // n = sc.nextInt();
        // println(armstrongNumbers(n));
        // print("Please enter a date in mm/dd/yyyy format: ");
        // String date = sc.next();
        // println(convertDate(date));
        try {
            double gasCost = sc.nextDouble();
            double numL = sc.nextDouble();
            if (gasCost <= 0 || numL <= 0) {
                println("needs to be positive");
                return;
            }
            println("Total cost: " + totalCost(gasCost, numL));
        } catch (Exception e) {
            println("Invalid input");
        }

        boolean isValid;
        do {
            // prompt for cost of gas
            // use next
            // try to parse it as a double
            // if fails, false the flag and iterate
            isValid = true;
            print("Please enter the cost of gas in positive double: ");
            String next = sc.next();
            gasCost = 0;

            try {
                gasCost = Double.parseDouble(next);
            } catch (NumberFormatException e) {
                isValid = false;
            }
            if (gasCost <= 0) {
                isValid = false;
            }
        } while (!isValid);

        do {
            // prompt for cost of gas
            // use next
            // try to parse it as a double
            // if fails, false the flag and iterate
            isValid = true;
            print("Please enter the number of litres in positive double: ");
            String next = sc.next();
            numL = 0;

            try {
                numL = Double.parseDouble(next);
            } catch (NumberFormatException e) {
                isValid = false;
            }
            if (numL <= 0) {
                isValid = false;
            }
        } while (!isValid);

        println("Total cost: " + totalCost(gasCost, numL));

    }

    public static double totalCost(double gasCost, double numL) {
        return gasCost * numL;
    }

    public static boolean armstrongNumbers(int n) {
        int ncopy = n;
        int length = String.valueOf(n).length();

        // 153 -> 1^3 + 5^3 + 3^3 == 153?
        int sum = 0;
        // for
        // while
        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            sum += Math.pow(digit, length);
            // sum = sum + digit ^ length;
        }
        return ncopy == sum;
    }

    public static String convertDate(String date) {
        // safety check whether date is in mm/dd/yyyy form
        return date.substring(3, 5) + "-" + date.substring(0, 2) + "-" + date.substring(6);
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
