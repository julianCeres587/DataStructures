package eda.pkg2025.DoubleLinkedList;

public class Node {

    private int value;
    private Node next;
    private Node previous;

    Node(){

    }

    Node(int value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public int getValue(){
        return this.value;
    }

    public  Node getNext(){
        return this.next;
    }

    public  Node getPrevious(){
        return this.previous;
    }

    public void setPrevious(Node n){
        this.previous = n;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public void setValue(int value){
        this.value = value;
    }

    
    
}
