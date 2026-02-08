package api;

public interface MyLinkedList {
    void insertAtBeginning(int data);
    int size();
    void display();
    void insertAtEnd(int data);
    void insetAtPosition(int data , int position);
    void deleteAtBegining();
    void deleteAtEnd();
    void deleteAtSpecificPosition(int pos);
}
