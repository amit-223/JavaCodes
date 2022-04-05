package com.example.AdvanceJ;

import org.w3c.dom.Node;

public class LL {
    Node head;
    Node tail;
    int size = 0;

    public void insertFirst(int val) {
        Node node = new Node();
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }


    class Node{
        int val;
        Node next;
    }
}
