package Lesson2;

import java.util.Arrays;

public class MyArrs {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0};
        for (int value : arr) {
            if (value == 0) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
        System.out.println();
        System.out.println();
        arr2(args);
        System.out.println();
        arr3(args);
        System.out.println();
        System.out.println();
        arr4(args);
        System.out.println();
        arr5(args);


    }

    public static void arr2(String[] args) {
        int[] arr2 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void arr3(String[] args) {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int value : arr3) {
            if (value < 6) {
                System.out.print(value * 2 + " ");
            }
        }
    }

    public static void arr4(String[] args) {
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr4[i][j] = (int)(Math.random() * 10);
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arr5(String[] args) {
        int max = 0;
        int min = 100;
        int[] arr5 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr5[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 10; i++)
            if (arr5[i] > max) {
                max = arr5[i];
            } else if (arr5[i] < min) {
                min = arr5[i];
            }
        System.out.println(Arrays.toString(arr5));
        System.out.println("Max = " + max + "," + "  Min = " + min);
    }
}

