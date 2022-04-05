package com.example.AdvanceJ;

import java.util.ArrayList;
import java.util.Arrays;



public class Valueequaltoindexvalue {
    public static void main(String[] args) {
        int[] arr =
                {1};
        int n = arr.length;
        ArrayList<Integer> ans;
        ans = fun(arr, n);
        for (int k:ans)
            System.out.println(k);

    }

    public static ArrayList<Integer> fun(int[] arr, int n) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            for (int j = 1; j <= n; j++) {
                if (temp == j) {
                    x.add(arr[i]);
                    break;
                }
            }
        }
        return x;
    }
}


