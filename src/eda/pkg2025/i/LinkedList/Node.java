package eda.pkg2025.i.LinkedList;

public class Node {

    private int value;
    private Node next;

    Node(){

    }

    Node(int value){
        this.value = value;
        this.next = null;
    }

    public int getValue(){
        return this.value;
    }

    public  Node getNext(){
        return this.next;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public void setValue(int value){
        this.value = value;
    }

    
    
}
