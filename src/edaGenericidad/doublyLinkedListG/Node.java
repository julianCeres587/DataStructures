package edaGenericidad.doublyLinkedListG;

public class Node<E> {

    private E value;
    private Node<E> next;
    private Node<E> previous;

    public Node(){

    }

    Node(E value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public E getValue(){
        return this.value;
    }

    public  Node<E> getNext(){
        return this.next;
    }

    public  Node<E> getPrevious(){
        return this.previous;
    }

    public void setPrevious(Node<E> n){
        this.previous = n;
    }

    public void setNext(Node<E> node){
        this.next = node;
    }

    public void setValue(E value){
        this.value = value;
    }

    
    
}

