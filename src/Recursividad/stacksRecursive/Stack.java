package Recursividad.stacksRecursive;


public class Stack <E> {
     private int size = 0;
      private Node <E> top;

     public Stack(){
            
      }

      public Stack(Node <E> top){
         this.top = top;
      }

      public void clear(){
        this.top = null;
        this.size = 0;
      }
      //creates a copy of the stack, useful to do operations without delete de original stack
      public Stack<E> copyOf() {
        Stack<E> auxStack = new Stack<>();
        Stack<E> copyStack = new Stack<>();
        
        Node<E> currentNode = this.top;
        while (currentNode != null) {
            auxStack.push(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        
         while (!auxStack.isEmpty()) {
            copyStack.push(auxStack.pop());
        }
        
        return copyStack;
    }

      public void push(E value){
        Node<E> newNode = new Node<E>(value, this.top);
        this.top = newNode;
         
        this.size++;
        }

        public E pop(){
            if(this.top != null){
                E value = this.top.getValue();
                this.top = this.top.getNext();
                this.size--;
                return value;
              }
              return null;
             
         }

       public Node <E> getTop(){
        return this.top;
      }

      public boolean isEmpty(){
        return this.size == 0;
      }

      public void setTop(Node <E> top){
         this.top = top;
      }

      public int getSize(){
        return this.size;
      }

      public void printStack(){

        Node<E> currentNode = this.top;
         while(currentNode != null){
             System.out.println(currentNode.getValue());
             currentNode = currentNode.getNext();
             }

      }
     //desapila e imprime la pila en su orden
      public void recursiveUnstack(Stack<E> stack){
             if(this.isEmpty()){
                  System.out.println();
             }
             else{
              System.out.println(stack.pop());
              recursiveUnstack(stack);
             }
     }
     //recibe una copia de la pila y su tope 
     public int minValueRecursive(Stack<E> stack, int min){
            //como min entra stack.getTop().getValue()
            int  aux;
            if(stack.isEmpty()){
                return min;
            }
            else{
               aux = (int)stack.pop();
                min = Math.min(min,aux);
                
               }
              return  minValueRecursive(stack, min);
           }


           //the paramether must be a copy of the stack, otherwhise, it's deleted
           //first of all, we get every value of the stack with stack.pop() 
           //with each call to the function, when we come to the base case, 
           //we return an empty stack, and then, when all the calls that we've done
           // are poping in the call stack, it reachs the code under the recursive state
           // and adds each element if it satisfies the conditions, it returns the stack in the same 
           //order but just with even numbers
           public Stack <E> evenElements(Stack<E> stack){
                 
            Node <E> currentNode = stack.getTop();
                 
                 Stack <E> newStack = new Stack<>();
                 
                 if(currentNode == null){
                     return newStack;
                 }
                 E value = stack.pop();
                 newStack = evenElements(stack);

                 if((int)value % 2 == 0){
                    newStack.push(value);
                 }

                 return newStack;

                  }



           } 

    
          
