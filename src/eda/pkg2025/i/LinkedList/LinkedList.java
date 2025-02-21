package eda.pkg2025.i.LinkedList;


// Search an specific element

//the index is used like we use that in arrays

public class LinkedList {

   private Node head;
   private Node tail;
   private int size = 0;

   public LinkedList(){
     
   }

    
    public void addBegining(int value){
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

    public void addLast(int value){
        Node newNode = new Node(value);
        
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.size++;
        
      }

      public void deleteFirst(){
        Node temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null);
       }

      public void deleteByIndex(int index){
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
                while(i != reference){
                    currentNode = currentNode.getNext();
                }
                currentNode.setNext(currentNode.getNext().getNext());
                currentNode.getNext().setNext(null);
               }
          }
          
      }

      public boolean exists(int num){
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
                return i; //como la variable sale del ciclo luego de validar que existe
            }
            else{
                return -1;
            }
           

        }

       public void deleteLast(){
        Node currentNode = this.head;

        while(currentNode.getNext().getNext() != null){
             currentNode = currentNode.getNext();
         }
            currentNode.setNext(null);
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



    
    


