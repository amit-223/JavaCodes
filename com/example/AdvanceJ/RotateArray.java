package com.example.AdvanceJ;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("T: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("N: ");
            int N = sc.nextInt();
            System.out.println("R: ");
            int R = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            rotate_fun(arr, R);
        }
    } // ends main method */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int r= 2;
        RotateArray obj = new RotateArray();
        obj.rotate_fun(arr,r);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate_fun(int[] arr, int r) {
        int n = arr.length;
        for (int i = 0; i < r; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n - 1] = temp;
        }
    } // function ends
}
