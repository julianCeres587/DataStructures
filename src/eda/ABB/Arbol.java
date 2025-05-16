package eda.ABB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Arbol {

    private Node raiz;

    public void agregar(int elemento) {
        if (raiz == null) {
            raiz = new Node(elemento);
        } else {
            raiz.agregar(elemento);   //metodo agregar de node
        }
    }

    public void inOrden(Node nodo) {    //IRD
        if (nodo == null) {
        } else {
            inOrden(nodo.getIzquierdo());//I
            System.out.println("Dato - > " + nodo.getDato());//R
            inOrden(nodo.getDerecho());//D
        }

    }

    public void postOrden(Node nodo) {//IDR
        if (nodo == null) {
        } else {
            postOrden(nodo.getIzquierdo());//I
            postOrden(nodo.getDerecho());//D
            System.out.println("Dato - > " + nodo.getDato());//R

        }

    }

    public void preOrden(Node nodo) {//RID
        if (nodo == null) {
        } else {
            System.out.println("Dato - > " + nodo.getDato());//R
            preOrden(nodo.getIzquierdo());//I
            preOrden(nodo.getDerecho());//D
        }

    }

    public void recorridoNiveles(Node nodo) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(nodo);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            Node izquierdo = currentNode.getIzquierdo();
            Node derecho = currentNode.getDerecho();

            if (izquierdo != null) {
                queue.add(izquierdo);

            }

            if (derecho != null) {
                queue.add(derecho);
            }
            System.out.println(currentNode.getDato());
        }

    }

    public Stack<Integer> inOrderStack(Node nodo, Stack<Integer> pila) {

        if (nodo == null) {
            return pila;
        } else {
            inOrderStack(nodo.getIzquierdo(), pila);//I
            pila.push(nodo.getDato());//R
            inOrderStack(nodo.getDerecho(), pila);//D
        }
        return pila;

    }

    public LinkedList<Integer> inOrderList(Node nodo, LinkedList<Integer> list) {

        if (nodo == null) {
            return list;
        } else {
            inOrderList(nodo.getDerecho(), list);//I
            list.push(nodo.getDato());//R
            inOrderList(nodo.getIzquierdo(), list);//D
        }
        return list;

    }

    public boolean contains(int target, Node node) {
        if (node == null) {
            return false;
        }
        if (node.getDato() == target) {
            return true;
        }
        if (node.getDato() > target) {
            return contains(target, node.getIzquierdo());
        } else {
            return contains(target, node.getDerecho());
        }
    }

    public Node getParent(int target, Node node, Node padre) {//inicialmente  nulo, pasa la raiz
        if (node == null) {
            return null;
        }
        if (node.getDato() == target) {
            return padre;
        }
        if (node.getDato() > target) {
            return getParent(target, node.getIzquierdo(), node);
        } else {

            return getParent(target, node.getDerecho(), node);
        }

    }

    public Node getNodeWhereIs(int target, Node node) {
        if (node == null) {
            return null;
        }
        if (node.getDato() == target) {
            return node;
        }
        if (node.getDato() > target) {
            return getNodeWhereIs(target, node.getIzquierdo());
        } else {
            return getNodeWhereIs(target, node.getDerecho());
        }
    }

    public void TargetHasNoSons(Node parent, Node target, boolean left, boolean right) {
        if (left) {
            parent.setIzquierdo(null);
        }

        if (right) {
            parent.setDerecho(null);
        }

    }

    public void TargetOneSon(Node parent, Node target) {
        int value = target.getDato();
        if (value > parent.getDato()) {
            if (target.getDerecho() != null) {
                parent.setDerecho(target.getDerecho());
            } else {
                parent.setDerecho(target.getIzquierdo());
            }
        } else {
            if (target.getDerecho() != null) {
                parent.setIzquierdo(target.getDerecho());
            } else {
                parent.setIzquierdo(target.getIzquierdo());
            }

        }
    }

    public void removeRoot() {
        if (this.raiz.isLeaf()) {
            this.raiz = null;
        }
        if (this.raiz.hasOneSon()) {
            this.raiz = (this.raiz.getDerecho() == null) ? this.raiz.getIzquierdo() : this.raiz.getDerecho();
        }
        if (this.raiz.hasTwoSon()) {
            Node sucesorNode = getSucesor(this.raiz.getDato(), this.raiz);
            Node parentSucesorNode = getParent(sucesorNode.getDato(), this.raiz, null);
            this.raiz.setDato(sucesorNode.getDato());
            if (sucesorNode.isLeaf()) {
                boolean estaEnIzquierda = false;
                boolean estaEnDerecha = false;
                if (parentSucesorNode.getDerecho().getDato() == sucesorNode.getDato()) {
                    estaEnDerecha = true;
                } else {
                    estaEnIzquierda = true;
                }
                TargetHasNoSons(parentSucesorNode, sucesorNode, estaEnIzquierda, estaEnDerecha);
            } else {   //si no es hoja, caer;a en el caso de que tiene un solo hijo
                TargetOneSon(parentSucesorNode, sucesorNode);
            }
        }

    }
    //realiza comparacion en nodo raiz con los dos hijos que le llegan, de ahí, compara con el que sea el par mayor
    //ese retorno siempre traerá al maximo par, ya que, de no ser par, retorna el maximo del subarbol

    public int getMaxPar(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int valor = node.getDato();
        int mayorDerecha = getMaxPar(node.getDerecho());
        int mayorIzquierda = getMaxPar(node.getIzquierdo());
        int maxSubarbol = Math.max(mayorDerecha, mayorIzquierda);

        if (valor % 2 == 0) {
            return Math.max(maxSubarbol, valor);
        } else {
            return maxSubarbol;
        }

    }

    public void removeNodeTwoChildren(int value, Node root, Node target) {
        Node sucesor = getSucesor(value, this.raiz);
        Node parentSucesor = getParent(sucesor.getDato(), this.raiz, null);
        target.setDato(sucesor.getDato());
        if (sucesor.isLeaf()) {
            boolean estaEnIzquierda = false;
            boolean estaEnDerecha = false;
            if (parentSucesor.getDerecho().getDato() == sucesor.getDato()) {
                estaEnDerecha = true;
            } else {
                estaEnIzquierda = true;
            }
            TargetHasNoSons(parentSucesor, sucesor, estaEnIzquierda, estaEnDerecha);
        } else {   //si no es hoja, caer;a en el caso de que tiene un solo hijo
            TargetOneSon(parentSucesor, sucesor);
        }
    }

    public void remove(int value) {

        if (value == this.raiz.getDato()) {
            removeRoot();  //valida los tres casos pero con la raiz, ya que no tendrá padre
        } else {
            Node parent = getParent(value, this.raiz, null);
            boolean left = false;
            boolean right = false;
            Node target;
            if (parent.getIzquierdo().getDato() == value) {
                left = true;
                target = parent.getIzquierdo();
            } else {
                right = true;
                target = parent.getDerecho();
            }
            //si no hay hijos, se desvincula del nodo padre
            if (target.isLeaf()) {
                TargetHasNoSons(parent, target, left, right);
            }
            //si tiene un solo hijo, el su padre se vincula a su nieto donde estaba su hijo
            if (target.hasOneSon()) {
                TargetOneSon(parent, target);
            }
            //si tiene dos hijos, buscamos el sucesor, su valor lo reemplazamos en el nodo del valor que 
            //buscamos eliminar, y para ordenar, se elimina a ese sucesor, quien tendrá,  0 hijos, o solo uno
            //con los metodos del caso 1 o 2 respectivamente
            if (target.hasTwoSon()) {
                removeNodeTwoChildren(value, this.raiz, target);

            }
        }

    }

    public Node getMin(Node node) {
        while (node.getIzquierdo() != null) {
            node = node.getIzquierdo();
        }
        return node;
    }

    public Node getMax(Node node) {
        while (node.getDerecho() != null) {
            node = node.getDerecho();
        }
        return node;
    }

    public int getNivel(int target, Node node) {
        int value;
        if (node == null) {
            return -1;
        }
        if (node.getDato() == target) {
            return 0;
        }
        if (node.getDato() > target) {
            value = getNivel(target, node.getIzquierdo());
        } else {
            value = getNivel(target, node.getDerecho());
        }

        if (value != - 1) {
            return 1 + value;
        } else {
            return -1;
        }

    }

    public Node getSucesor(int valor, Node node) {   //pasa como parametro RAIZ del arbol para busscar desde allí
        Node sucesor = null;
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.getDato() > valor) {   //va recorriendo hasta encotntrar el nodo, gardando ancestro mas reciente
                sucesor = currentNode;  //entra solo cuando el nodo se va a la izquierda, sino lo hace nunca, no hay sucesor
                currentNode = currentNode.getIzquierdo();
            } else {
                if (currentNode.getDato() < valor) {
                    currentNode = currentNode.getDerecho();
                } else {
                    if (currentNode.getDerecho() != null) {
                        return getMin(currentNode.getDerecho());
                    } //encuentra el nodo, si tiene nodo derecho, va al minimo de ese subarbol
                }
            }
        }
        return sucesor;
    }

    public void printRange(int min, int max, Node nodo) {
        if (nodo == null) {
            return;
        }
        if (min > nodo.getDato()) {
            printRange(min, max, nodo.getDerecho());
        }
        if (max < nodo.getDato()) {
            printRange(min, max, nodo.getIzquierdo());
        }
        if (nodo.getDato() >= min && nodo.getDato() <= max) {
            System.out.println(nodo.getDato());
            printRange(min, max, nodo.getDerecho());
            printRange(min, max, nodo.getIzquierdo());

        }
    }

    public void getPrevNext(int value) {
        Node nodo = this.raiz;
        LinkedList lista = new LinkedList<>();
        lista = inOrderList(nodo, lista);
        if (lista.contains(value)) {
            int index = lista.indexOf(value);
            if (index > 0 && index + 1 < lista.size()) {
                System.out.println("Predecesor: " + lista.get(index - 1) + " Sucesor: " + lista.get(index + 1));
            }
            if (index > 0 && !(index + 1 < lista.size())) {
                System.out.println("Predecesor: " + lista.get(index - 1) + " No hay Sucesor");
            }
            if (!(index > 0) && (index + 1 < lista.size())) {
                System.out.println("No hay predecesor,  Sucesor: " + lista.get(index + 1));
            }
        } else {
            System.out.println("El elemento consultado no existe");
        }

    }

    public int calcularMaximoPar(Node nodo) {
        Stack<Integer> pila = new Stack<>();
        pila = inOrderStack(nodo, pila);

        boolean found = false;
        int numero = Integer.MIN_VALUE;
        while (!pila.isEmpty() && found == false) {
            int n = pila.pop();
            if (n % 2 == 0) {
                found = true;
                numero = n;
            }
        }

        return numero;
    }

    public boolean sameStructure(Node nodo1, Node nodo2) {
        if (nodo1 == null && nodo2 == null) {
            return true;
        }
        if ((nodo1 == null && nodo2 != null) || (nodo1 != null && nodo2 == null)) {
            return false;
        }

        return sameStructure(nodo1.getIzquierdo(), nodo2.getIzquierdo()) && sameStructure(nodo1.getDerecho(), nodo2.getDerecho());

    }

    public int calcularHojas(Node nodo) {
        int hojas = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(nodo);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            Node izquierdo = currentNode.getIzquierdo();
            Node derecho = currentNode.getDerecho();

            if (izquierdo != null) {
                queue.add(izquierdo);
            }

            if (derecho != null) {
                queue.add(derecho);
            }
            if (izquierdo == null && derecho == null) {
                hojas++;
            }

        }
        return hojas;
    }

    public int calcularSuma(Node node) {

        if (node == null) {
            return 0;
        }

        int leftSum = calcularSuma(node.getIzquierdo());
        int rightSum = calcularSuma(node.getDerecho());

        return leftSum + rightSum + node.getDato();

    }

    public int calcularPeso(Node nodo) {
        if (nodo == null) {
            return 0;
        } else {
            return 1 + calcularPeso(nodo.getIzquierdo()) + calcularPeso(nodo.getDerecho());
        }

    }

    //parametros son la raiz del primer arbol y la del segundo
    public boolean sameStructureContent(Node nodo1, Node nodo2) {
        if (nodo1 == null && nodo2 == null) {
            return true;
        }
        if ((nodo1 == null && nodo2 != null) || (nodo1 != null && nodo2 == null)) {
            return false;
        }
        if (nodo1.getDato() == nodo2.getDato()) {
            return sameStructure(nodo1.getIzquierdo(), nodo2.getIzquierdo()) && sameStructure(nodo1.getDerecho(), nodo2.getDerecho());
        } else {
            return false;
        }

    }
    //busca los valores dentro del rango volviendo a llamar a la funcion 
    //cuando encuentre valores en el rango, es donde hará un retorno de la suma de lo que va subiendo

    public int calcularSumaRango(Node node, int min, int max) {
        if (node == null) {
            return 0;
        }
        if (min > node.getDato()) {
            calcularSumaRango(node.getDerecho(), min, max); //esto se usa para moverse por los rangos validos
        }
        if (max < node.getDato()) {
            calcularSumaRango(node.getIzquierdo(), min, max);
        }

        int leftSum = calcularSumaRango(node.getIzquierdo(), min, max);  //
        int rightSum = calcularSumaRango(node.getDerecho(), min, max);

        if (node.getDato() >= min && node.getDato() <= max) {

            return leftSum + rightSum + node.getDato();
        } else {
            return leftSum + rightSum;
        }

    }

    public int calcularHojasRango(Node nodo, int min, int max) {
        int hojas = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(nodo);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            Node izquierdo = currentNode.getIzquierdo();
            Node derecho = currentNode.getDerecho();

            if (izquierdo != null) {
                queue.add(izquierdo);
            }

            if (derecho != null) {
                queue.add(derecho);
            }
            if (currentNode.isLeaf() && currentNode.getDato() > min && currentNode.getDato() < max) {
                hojas++;
            }

        }
        return hojas;

    }

    public int calcularAltura(Node nodo) { //encuentra el camino mas largo y esa es la altura
        if (nodo == null) {
            return 0;
        } else {
            return 1 + Math.max(calcularAltura(nodo.getIzquierdo()), calcularAltura(nodo.getDerecho()));
        }
    }

    //determinar cuantos son no terminales   diferencia de hojas y peso de arbol
    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }

}
