package com.example.AdvanceJ;

public class recursionString {
    public static void main(String[] args) {
//        skip(" ", "baca");
    }

    //substring will remove char
    static void sub_string(String str){
        int i = 0;
        while (i < 3){
            str = str.substring(i);
            i++;
        }
        System.out.println(str);
    }

    static String skip1(String empty, String str,int i){
        if (i == str.length()){
            return empty;
        }
        if (str.charAt(i)!= 'a'){
            empty+= str.charAt(i);
        }
        return skip1(empty,str,i+1);
    }

    static void skip(String empty, String str) {
        if (str.isEmpty()) {
            System.out.println(empty);
            return;
        }
        char ch = str.charAt(0);

        if (ch == 'a') {
            skip(empty, str.substring(1));
        } else {
            skip(empty + ch, str.substring(1));
        }
    }


}
