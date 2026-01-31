package core;

import api.MyLinkedList;

public abstract class AbstractLinkedList implements MyLinkedList {
    protected Node head;
    protected int size;
    protected Node tail;

    public AbstractLinkedList(Node head) {
        this.head = head;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void display(){
        Node temp = head;
        if(temp == null){

        }
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}
