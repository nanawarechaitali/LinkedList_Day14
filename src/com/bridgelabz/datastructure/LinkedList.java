package com.bridgelabz.datastructure;

public class LinkedList<K> {
    Node<K> head;
    Node<K> tail;

    public void push(K key){

        Node<K> newNode = new Node<>(key);
        if(head==null){
            head =newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
            return;

        }
        Node<K> temp=head;
        while(temp!=null){
            System.out.println(temp.key+"->");
            temp=temp.next;

        }
        temp.next=newNode;

    }
    public void add(K key){
        Node<K> newNode= new Node<>(key);
        if(head==null){
            head=newNode;
            tail=newNode;

        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
}
