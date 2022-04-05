package com.example.AdvanceJ;

public class string_Subsequence {
    public static void main(String[] args) {
//        subseqAscii("", "abc");
        subseq("", "abc");
    }


    static void subseq(String empty, String up) {
        if (up.isEmpty()) {
            System.out.println(empty);
            return;
        }
        char ch = up.charAt(0);
        subseq(empty + ch, up.substring(1));
        subseq(empty, up.substring(1));
    }
}
