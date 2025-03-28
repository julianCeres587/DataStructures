package edaGenericidad.doublyLinkedListG;

//los objetos que se vayan a comparar deben tener un equals
public class DoublyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public DoublyLinkedList() {

    }

    public void addBeginning(E value) {
        Node<E> newNode = new Node<E>(value);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = this.head;

        } else {
            newNode.setNext(this.head);
            this.head.setPrevious(newNode);
            this.head = newNode;
        }
        this.size++;

    }

    public void addByindex(int index, E value) {
        if (index == 0) {
            this.addBeginning(value);
            return;
        }
        if (index == this.size) { //acá tenía this.size -1
            this.addLast(value);
            return;
        }
        Node<E> currentNode = this.head;
        Node<E> newNode = new Node<E>(value);
        int i = 0;
        //index -1 para que salga antes, cuando el nodo permite hacer la modificacion
        while (currentNode != null && i != index - 1) {
            currentNode = currentNode.getNext();
            i++;
        }
        newNode.setNext(currentNode.getNext());//le asigna como siguiente el que ocupaba su posicion
        newNode.setPrevious(currentNode);
        currentNode.getNext().setPrevious(newNode);
        currentNode.setNext(newNode);//agrega el nuevo nodo en la posicion

        this.size++;
    }

    public void addLast(E value) {
        Node<E> newNode = new Node<E>(value);

        if (this.size == 0) {
            this.head = newNode;
            this.tail = this.head;
            this.size++;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
            this.size++;
        }
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean contains(E value) {
        boolean exists = false;
        Node<E> currentNodeB = this.head;
        Node<E> currentNodeL = this.tail;
        while (currentNodeB != null && exists == false && currentNodeL != null) {
            if (currentNodeB.getValue().equals(value) || currentNodeL.getValue().equals(value)) {
                exists = true;
            }   //goes through the list by both sides
            currentNodeB = currentNodeB.getNext();
            currentNodeL = currentNodeL.getPrevious();
        }
        return exists;
    }

    public DoublyLinkedList<E> copyOf() {
        Node<E> currentNode = this.head;
        DoublyLinkedList<E> copy = new DoublyLinkedList<>();
        while (currentNode != null) {
            copy.addLast(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
        return copy;

    }

    public void delete(E value) {
        boolean finish = false;
        boolean found = false;
        Node<E> currentNodeB = this.head;
        Node<E> currentNodeL = this.tail;
        Node<E> tempNode = null;
        while (currentNodeB != null && currentNodeL != null && finish != true) {
            if (currentNodeB.getValue().equals(value) || currentNodeL.getValue().equals(value)) {
                if (currentNodeB.getValue().equals(value)) {
                    tempNode = currentNodeB;
                }
                if (currentNodeL.getValue().equals(value)) {
                    tempNode = currentNodeL;
                }
                found = true;
                break;
            }   //goes through the list by both sides
            if (this.size % 2 == 0) {
                finish = currentNodeB == currentNodeL;
            } else {
                finish = currentNodeB.getNext() == currentNodeL;
            }
            currentNodeB = currentNodeB.getNext();
            currentNodeL = currentNodeL.getPrevious();

        }
        if (found == true) {
            if (tempNode.getPrevious() == null) {
                deleteFirst();
            } else if (tempNode.getNext() == null) {
                deleteLast();

            } else {
                tempNode.getNext().setPrevious(tempNode.getPrevious());
                tempNode.getPrevious().setNext(tempNode.getNext());
                tempNode.setNext(null);
                tempNode.setPrevious(null);
                this.size--;
            }

        }

    }

    //we use the index like in arrays 
    public void deleteByIndex(int index) {
        if (index < this.size) {
            //int reference = index - 1;
            int i = 0;
            if (index == 0) {
                this.deleteFirst();
            } else {
                if (index == this.size - 1) {
                    this.deleteLast();
                } else {

                    double n = (double) this.size / 2;

                    if (index >= n) {//recorre de derecha a izquierda si la posicion está más hacia ese lado
                        Node<E> currentNode = this.tail;
                        int inverseReference = (this.size - 1) - index;
                        while (i != inverseReference && currentNode != null) {
                            currentNode = currentNode.getPrevious();
                            i++;  //sale con el nodo que queremos borrar
                        }
                        Node<E> tmp = currentNode;
                        currentNode.getNext().setPrevious(currentNode.getPrevious());
                        currentNode.getPrevious().setNext(currentNode.getNext());
                        tmp.setNext(null);
                        tmp.setPrevious(null);
                        this.size--;
                    } else {
                        Node<E> currentNode = this.head;
                        while (i != index && currentNode != null) {
                            currentNode = currentNode.getNext();
                            i++;
                        }
                        Node<E> tmp = currentNode;
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

    public void deleteFirst() {
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            this.head = this.head.getNext();
            this.head.getPrevious().setNext(null);;
            this.head.setPrevious(null);
            this.size--;
        }

    }

    public void deleteLast() {
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size--;
        } else {
            this.tail = this.tail.getPrevious();
            this.tail.getNext().setPrevious(null);
            this.tail.setNext(null);
            this.size--;
        }
    }

    //returns the element at the intex
    public E get(int index) {

        double n = this.size / 2; // it's useful to know the side to use
        if (index >= n) {
            Node<E> currentNode = this.tail;
            int i = this.size - 1;
            while (i != index && currentNode != null) {
                currentNode = currentNode.getPrevious();
                i--;
            }
            return currentNode.getValue();
        } else {
            Node<E> currentNode = this.head;
            int i = 0;
            while (currentNode != null && i != index) {
                currentNode = currentNode.getNext();
                i++;
            }
            return currentNode.getValue();
        }

    }

    public Node<E> getNode(int index) {
        Node<E> currentNode = this.head;
        int i = 0;
        while (currentNode != null && i != index) {
            currentNode = currentNode.getNext();
            i++;
        }
        return currentNode;
    }
    //it uses both sides

    public int indexOf(E value) {
        boolean exists = false;
        boolean reverso = false;
        Node<E> currentNodeB = this.head;
        Node<E> currentNodeL = this.tail;
        int i = 0;
        while (currentNodeB != null && exists == false && currentNodeL != null) {
            if (currentNodeB.getValue().equals(value)) {
                exists = true;
            }
            if (currentNodeL.getValue().equals(value)) {
                exists = true;
                reverso = true;

            }

            currentNodeB = currentNodeB.getNext();
            currentNodeL = currentNodeL.getPrevious();
            i++;
        }
        if (reverso) {
            return (this.size - 1) - (i - 1);
        } else {
            if (exists == true && !reverso) {
                return i - 1; //como la variable sale del ciclo luego de validar que existe
            } else {
                return -1;
            }
        }

    }

    public void printList() {
        Node<E> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public void printReverseList() {
        Node<E> currentNode = this.tail;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getPrevious();
        }
    }

    public Node<E> getFirstNode() {
        return this.head;
    }

    public int getSize() {
        return this.size;
    }

    public E nodeGetFirstValue() {
        return this.head.getValue();
    }

    public Node<E> getLastNode() {
        return this.tail;
    }

    public E nodeGetLastValue() {
        return this.tail.getValue();
    }

}
