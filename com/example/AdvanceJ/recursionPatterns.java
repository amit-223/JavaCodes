package com.example.AdvanceJ;

import java.util.Arrays;

public class recursionPatterns {
    public static void main(String[] args) {
//        triangle2(4, 0);
//        revtriangle(4,0);
        int[] arr = {1, 44, 33, 5,9};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }

    static void revtriangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            revtriangle(r, c + 1);

        } else {
            System.out.println();
            revtriangle(r - 1, 0);

        }
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1); //first call recursion, after printing *
            // which is stored in stack memory
            System.out.print("*");
        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }

}
