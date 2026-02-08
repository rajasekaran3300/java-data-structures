package impl;

import core.AbstractLinkedList;
import core.Node;

import javax.net.ssl.CertPathTrustManagerParameters;

public class SinglyLinkedList extends AbstractLinkedList {

    public SinglyLinkedList() {
        super(null);
    }

    @Override
    public void insertAtBeginning(int data) {
        if(head == null){
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    @Override
    public void insertAtEnd(int data) {
        if(head == null){
            Node newNode = new Node(data);
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    @Override
    public void insetAtPosition(int data, int position) {
        if(position > size){
            throw new IndexOutOfBoundsException("position cannot be greater than List size");
        }
        Node temp = head;
        int count = 1;
        while(temp.next!=null){

            if(count == position){
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            count++;
            temp = temp.next;
        }
    }

    @Override
    public void deleteAtBegining(){
        if(head == null){
            System.out.println("No LinkedList found");
            return;
        }
        else{
            head = head.next;
            size--;
        }

    }

    @Override
    public void deleteAtEnd() {
        int count = 1;
        Node temp = head;
        if(head== null){
            System.out.println("No LinkedList found");
            return;
        }
        else{
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next= null;
            tail = temp;
            size--;
        }

    }

    @Override
    public void deleteAtSpecificPosition(int pos) {

    }


}
