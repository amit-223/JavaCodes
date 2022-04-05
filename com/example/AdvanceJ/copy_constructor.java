package com.example.AdvanceJ;

class copy_constructor {
    static void print(){
        System.out.println("inside copy constructor");
    }

    public static void main(String[] args) {
        copy_constructor obj = new copy_constructor();
        obj.print();
        copy_constructor obj2 =  obj;

        obj.print();
    }
}


