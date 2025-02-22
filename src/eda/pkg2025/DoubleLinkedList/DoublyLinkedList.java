package eda.pkg2025.DoubleLinkedList;

//verificar qwue al agregar y eliminar se haga la modificacion a size

//solo add last y add beginning estaban adecuados

public class DoublyLinkedList {

    private Node head;
    private Node tail;
   private int size = 0;

   public DoublyLinkedList(){
     
   }

    
    public void addBeginning(int value){
        Node newNode = new Node(value);
        if(this.size == 0){
            this.head = newNode;
            this.tail = this.head;
            
        }
        else{
         newNode.setNext(this.head);
        this.head.setPrevious(newNode);
        this.head = newNode;
         }
        this.size++;
        
    }

    public void addByindex(int index, int value){
        if(index == 0){
          this.addBeginning(value);
          return;
        }
        if(index == this.size-1){
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
          newNode.setPrevious(currentNode);
          currentNode.getNext().setPrevious(newNode);
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
                newNode.setPrevious(this.tail);
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
            Node currentNodeB = this.head;
            Node currentNodeL = this.tail;
            while(currentNodeB != null && exists == false && currentNodeL != null){
               if(currentNodeB.getValue() == num || currentNodeL.getValue() == num){
                   exists = true;
                }   //goes through the list by both sides
               currentNodeB = currentNodeB.getNext();
               currentNodeL = currentNodeL.getPrevious();
             }
            return exists;
           }

           //we use the index like in arrays 
      public void deleteByIndex(int index){
        if(index < this.size){
            //int reference = index - 1;
            int i = 0;
            if(index == 0){
              this.deleteFirst();
            }
            else{
              if(index == this.size - 1){
                   this.deleteLast();
              }
              else{

                double n = (double)this.size/2;

                if(index >= n){//recorre de derecha a izquierda si la posicion está más hacia ese lado
                    Node currentNode = this.tail;
                    int inverseReference = (this.size - 1) - index;
                    while(i != inverseReference && currentNode != null){
                      currentNode = currentNode.getPrevious();
                      i++;  //sale con el nodo que queremos borrar
                   }
                   Node tmp = currentNode;
                   currentNode.getNext().setPrevious(currentNode.getPrevious());
                   currentNode.getPrevious().setNext(currentNode.getNext());
                   tmp.setNext(null);
                   tmp.setPrevious(null);
                   this.size--;
                }
                else{
                    Node currentNode = this.head;
                    while(i != index && currentNode != null){
                      currentNode = currentNode.getNext();
                      i++;
                   }
                   Node tmp = currentNode;
                   currentNode.getNext().setPrevious(currentNode.getPrevious());
                   currentNode.getPrevious().setNext(currentNode.getNext());
                   tmp.setNext(null);
                   tmp.setPrevious(null);
                   this.size--;
                }
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
            this.head = this.head.getNext();
            this.head.getPrevious().setNext(null);;
            this.head.setPrevious(null);
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
           this.tail = this.tail.getPrevious();
           this.tail.getNext().setPrevious(null);
           this.tail.setNext(null);
           this.size--;
            }
        }

       //returns the element at the intex
       public int get(int index){
        
        double n = this.size/2;
        if(index >= n){
            Node currentNode = this.tail;
            int i = this.size - 1;
            while(i != index && currentNode != null){
                currentNode = currentNode.getPrevious();
                i--;
            }
            return currentNode.getValue();
        }
        else{
            Node currentNode = this.head;
            int i = 0;
            while(currentNode != null && i != index){
               currentNode = currentNode.getNext();  
                 i++;
            }
            return currentNode.getValue();
        }
        
       }
       
        public int indexOf(int value){
            boolean exists = false;
            boolean reverso = false;
            Node currentNodeB = this.head;
            Node currentNodeL = this.tail;
            int i = 0;
            while(currentNodeB != null && exists == false && currentNodeL != null){
               if(currentNodeB.getValue() == value){
                   exists = true;
                    }
               if(currentNodeL.getValue() == value){
                  exists = true;
                  reverso = true;
                 
               }

               currentNodeB = currentNodeB.getNext();
               currentNodeL = currentNodeL.getPrevious();
               i++;
            }
            if(reverso){
                return (this.size-1) - (i-1);
            }
            else{
                if(exists == true && !reverso){
                    return i-1; //como la variable sale del ciclo luego de validar que existe
                }
                else{
                    return -1;
                }
            }
            
         }

        public void printList(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
            }
        }

        public void printReverseList(){
            Node currentNode = this.tail;
            while(currentNode != null){
                System.out.println(currentNode.getValue());
                currentNode = currentNode.getPrevious();
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
