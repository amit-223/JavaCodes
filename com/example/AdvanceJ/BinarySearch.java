package com.example.AdvanceJ;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,-7,7,-4};
        int target = 5;
        System.out.println(BS(arr, target));
    }

    static int BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
