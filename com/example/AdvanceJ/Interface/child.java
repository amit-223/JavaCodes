package com.example.AdvanceJ.Interface;

public class child implements parent1,parent2 {

    @Override
    public void method1() {
        System.out.println("1");
    }

    @Override
    public void same() {
        System.out.println("same"); //make no sense
    }


    @Override
    public void method2() {
        System.out.println("2");
    }
}
