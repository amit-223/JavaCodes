package Leetcode.Arrays;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int M = A.length, N = A[0].length;
        int[][] B = new int[N][M];
        for (int j = 0; j < N; j++)
            for (int i = 0; i < M; i++)
                B[j][i] = A[i][j];

        for (int j = 0; j < B.length; j++)
            for (int i = 0; i < B.length; i++)
                System.out.print(B[i][j]+ "");
            System.out.println();

    }
}
