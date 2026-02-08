import api.MyLinkedList;
import core.AbstractLinkedList;
import impl.SinglyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtBeginning(1);
//        singlyLinkedList.insertAtBeginning(2);
//        singlyLinkedList.insertAtBeginning(3);
        singlyLinkedList.insertAtEnd(2);
        singlyLinkedList.insertAtEnd(3);
        singlyLinkedList.insertAtEnd(4);
        singlyLinkedList.insertAtEnd(5);
        singlyLinkedList.insertAtEnd(6);
//        singlyLinkedList.insetAtPosition(20,2);
        singlyLinkedList.deleteAtBegining();
        singlyLinkedList.deleteAtEnd();
        singlyLinkedList.deleteAtEnd();
        singlyLinkedList.display();
        System.out.println();
        System.out.println(singlyLinkedList.size()+" : size");
    }
}