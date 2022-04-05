package com.example.AdvanceJ;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class DigiValetQ2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        } // ends input
//        int[] ans = alternate(arr);
//        for (int k : arr)
//            System.out.print(k + " ");
//    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 0, 2, 3};
        int[] answer;
        answer = alternate(arr);
        for (int k : answer)
            System.out.print(k + " ");
    }

    public static int[] alternate(int[] arr) {
        int[] ans = new int[1000]; // error because size of array never decrease , so we have to use dynamically arra
        Arrays.sort(arr);
        int x = 0; int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                ans[x] = arr[i];
                x++;
                length++;
            }
        }

        int l = ans.length;
        l = length;
        ans = new int[l]; // resize array


        return ans;
    }
}
