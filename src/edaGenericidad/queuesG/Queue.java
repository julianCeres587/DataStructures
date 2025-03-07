package edaGenericidad.queuesG;

//adds by the head, delete by the tail

public class Queue<E> {
     private Node <E> tail;
     private Node <E> head;
     private int size;

     public Queue(){

     }

     public Queue(Node<E> tail, Node<E> head){
        this.tail = tail;
        this.head = head;
     }

     public void enqueue(E value){
        Node<E> newNode = new Node<E>( value);
        if(this.size == 0){
            this.head = newNode;
            this.tail = this.head;
         }
         else{
            this.tail.setNext(newNode);
            this.tail = this.tail.getNext();
            
         }
         this.size++;
        }

        public E dequeue(){
            if(this.size >= 1){
                E value = this.head.getValue();
                this.head = this.head.getNext();
                this.size--;
             return value;
            }
             return null;
        
             }

             public int getSize(){
                return this.size;
             }

             public Node<E> getTail(){
                return this.tail;
             }

             public void setTail(Node<E> tail){
                this.tail = tail;
             }

             public Node<E> getHead(){
                return this.head;
             }

             public void setHead(Node<E> head){
                this.head = head;
             }

             public void printQueue(){
                Node<E> currentNode = this.head;
                while(currentNode != null){
                    System.out.println(currentNode.getValue());
                    currentNode = currentNode.getNext();
                    }
                
             }



    
}
