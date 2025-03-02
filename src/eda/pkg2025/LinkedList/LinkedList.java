package eda.pkg2025.LinkedList;



//when we add by index or delete by index, we think that the index is in the range 


public class LinkedList {

   private Node head;
   private Node tail;
   private int size = 0;

   public LinkedList(){
     
   }

    
    public void addBeginning(int value){
        Node newNode = new Node(value);
        if(this.size == 0){
            this.head = newNode;
            this.tail = this.head;
            
        }
        else{
        newNode.setNext(this.head);
        this.head = newNode;
         }
        this.size++;
        }

    public void addByindex(int index, int value){
        if(index == 0){
          this.addBeginning(value);
          return;
        }
        if(index == this.size){
          this.addLast(value);
          return;
        }
        Node currentNode = this.head;
         Node newNode = new Node(value);
         int i = 0;
          //index -1 para que salga antes, cuando el nodo permite hacer la modificacion
         while(currentNode != null && i != index-1){
          currentNode = currentNode.getNext();  
            i++;
         }
          newNode.setNext(currentNode.getNext());//le asigna como siguiente el que ocupaba su posicion
          currentNode.setNext(newNode);//agrega el nuevo nodo en la posicion
          this.size++;
        }

     public void addLast(int value){
        Node newNode = new Node(value);
             if(this.size == 0){
                this.head = newNode;
                this.tail = this.head;
                this.size++;
            }
            else{
                this.tail.setNext(newNode);
                this.tail = newNode;
                this.size++;
            }
        }

        public void clear(){
            this.head = null;
            this.tail = null;
            this.size = 0;
         }

        public boolean contains(int num){
            boolean exists = false;
            Node currentNode = this.head;
            while(currentNode != null && exists == false){
               if(currentNode.getValue() == num){
                   exists = true;
                }
               currentNode = currentNode.getNext();
             }
            return exists;
           }

           //we use the index like in arrays 
      public void deleteByIndex(int index){
        if(index < this.size){
            int reference = index - 1;
            int i = 0;
            if(index == 0){
              this.deleteFirst();
            }
            else{
              if(index == this.size - 1){
                   this.deleteLast();
              }
              else{
                  Node currentNode = this.head;
                  while(i != reference && currentNode != null){
                      currentNode = currentNode.getNext();
                      i++;
                  }
                  Node temp = currentNode.getNext();
                  currentNode.setNext(currentNode.getNext().getNext());
                  temp.setNext(null);
                  this.size--;
                 }
             }
        }
        
     }

      public void deleteFirst(){
        if(this.size==1){
            this.head = null;
            this.tail = null;
            this.size--;
        }
        else{
            Node temp = this.head;
            this.head = this.head.getNext();
            temp.setNext(null);
            this.size--;
        }
        
       }

       public void deleteLast(){
        if(this.size==1){
            this.head = null;
            this.tail = null;
            this.size--;
        }
        else{
            Node currentNode = this.head;
                while(currentNode.getNext().getNext() != null){
                 currentNode = currentNode.getNext();
             }
                currentNode.setNext(null);
                this.tail = currentNode;
                this.size--;
          }
        }

       //returns the element at the intex
       public int get(int index){
        Node currentNode = this.head;
        int i = 0;
        while(currentNode != null && i != index){
           currentNode = currentNode.getNext();  
             i++;
        }
        return currentNode.getValue();
       }
       
        public int indexOf(int value){
            boolean exists = false;
            Node currentNode = this.head;
            int i = 0;
            while(currentNode != null && exists == false){
               if(currentNode.getValue() == value){
                   exists = true;
                    }
               currentNode = currentNode.getNext();
               i++;
            }
            if(exists == true){
                return i-1; //como la variable sale del ciclo luego de validar que existe
            }
            else{
                return -1;
            }
         }

        public void printList(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
            }
        }
        
        public Node getFirstNode(){
          return this.head;
          }

          public int getSize(){
            return this.size;
         }

         public int nodeGetFirstValue(){
            return this.head.getValue();
         }

         public int nodeGetLastValue(){
            return this.tail.getValue();
         }
 }



    
    


