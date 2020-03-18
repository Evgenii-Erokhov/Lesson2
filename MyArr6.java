package Lesson2;

import java.util.Arrays;

public class MyArr6 {
    public static void main(String[] args) {
        int[] arr6 = {3, 6, 3, 7, 5, 4, 7, 1, 4, 4, 5, 7};
        int[] left = new int[11];
        int[] right = new int[11];
        left[0] = arr6[0];
        right[10] = arr6[11];
        for (int i = 1; i <= 10; i++) {
             left[i] = left[i - 1] + arr6[i];
        }
        System.out.println(Arrays.toString(left));
        for (int i = 9; i >= 0  ; i--) {
            right[i] = arr6[i + 1] + right[i + 1];
        }
        System.out.println(Arrays.toString(right));

        System.out.println(balance(left, right));
    }

    public static boolean balance(int[] left, int[] right) {
        boolean balance;
        balance = false;
        for (int i = 0; i <= 10; i++) {
            if (left[i] == right[i]) {
                balance = true;
                break;
            }
        }
        return balance;
    }
}