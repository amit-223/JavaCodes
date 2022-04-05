package com.example.AdvanceJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Java1dand2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] brr = {3, 6, 9};
        int n = 3;
        ArrayList<Integer> ans;
        ans = fun(arr, brr, n);
        for (int i : ans)
            System.out.print(i + " ");
        System.out.println();
    }

    public static ArrayList<Integer> fun(int[][] arr, int[] brr, int n) {
        ArrayList<Integer> x = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        x.add(sum);

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (brr[i] > max) {
                max = brr[i];
            }
        }
        x.add(max);
        return x;


    }


}
