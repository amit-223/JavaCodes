package com.example.AdvanceJ;

import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
//        revfun(5);
        int[] arr = {2, 3, 1, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexLast(arr, 4, arr.length - 1));
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    private static void revfun(int i) {
        if (i == 0) {
            return;
        }
        revfun(i - 1);
        System.out.print(i + " ");

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> fun(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length - 1) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
            return fun(arr, target, index + 1);
        } else {
            return fun(arr, target, index + 1);
        }

    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length - 1) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }


}
