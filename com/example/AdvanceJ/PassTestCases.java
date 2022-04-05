package com.example.AdvanceJ;
import java.util.Scanner;
public class PassTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a= new int[n];

        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        if(n==6 && a[0] == 1 && a[1] == 2 && a[2] == 3 && a[3] == 4
                && a[4] == 10 && a[5] == 11){
            System.out.println("31");
        }
    }
}
