package com.bridgelabz.datastructure;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args)  {
        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);

        System.out.println(linkedList1);
        System.out.println("***********************");
        LinkedList<Integer> linkedList2=new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(70);
        linkedList2.add(30);
        System.out.println(linkedList2);


    }



}
