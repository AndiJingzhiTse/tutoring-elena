
import java.io.*;
import java.util.*;

class array {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3, 2, 6, 1, 3, 10, -10};

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j >= 1 && nums[j - 1] > nums[j]; j--) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
            }
        }
        printArr(nums);

        // jagged vs rectangular
        int[][] twoD = new int[3][4]; // 3 rows, 4 columns array
        int[][] jagged = new int[3][]; // 3 rows, but column length is not given yet
        int[][] prefilled = {{1, 2, 3}, {4, 5, 6}}; // 2 rows, 3 columns
        /*
        1 2 3
        4 5 6
         */
        int[][] prefilled2 = {{1, 2, 3}, {1, 2}}; // 2 rows, 0th row has 3 column, 1th row has 2 column
        // [[], [], []]

        // for (int r = 0; r < twoD.length; r++) {
        //     for (int c = 0; c < twoD[r].length; c++) {
        //         System.out.println("Please enter an integer for row " + r + ", column " + c + ": ");
        //         twoD[r][c] = sc.nextInt();
        //     }
        // }
        // print2DArr(twoD);
        // println(contains(nums, 10)); // true
        // println(contains(nums, 0)); // false
        // println(indexOf(nums, 6));
        // println(indexOf(nums, -12));
        Arrays.sort(nums);
        int[] nums2 = {-1, 0, 1, 2, 3, 4};
        int[] nums3 = new int[0];
        println(binarySearch(nums2, 3));
        println(binarySearch(nums2, 6));
        println(binarySearch(nums3, 0));
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // (low + high) / 2;
            // low + high/2 - low/2
            // low/2 + high/2
            // (low+high)/2
            // low = 2e, high = 4e
            // 6e
            // 3e

            // low <= mid <= high
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // sequential search
    public static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
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
