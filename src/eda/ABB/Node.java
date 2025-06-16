package eda.ABB;

public class Node {

    
    private boolean viewed;

    

    private int dato;
    private Node izquierdo;
    private Node derecho;
   
    public Node(int dato) {
        this.dato = dato;
         
    }

    public boolean isLeaf(){
        return this.izquierdo == null && this.derecho == null;
    }

    public boolean hasTwoSon(){
        return this.izquierdo != null && this.derecho != null;
    }

    public boolean hasOneSon(){
        return (this.derecho == null && this.izquierdo != null) || (this.derecho !=null && this.izquierdo == null);
    }

    public void cleanNode(){
        this.derecho = null;
        this.izquierdo = null;
    }

    
     
    public Node[] getChildren(){
        Node[] children = new Node[2];
        if(this.izquierdo !=null){
            children[0] = this.izquierdo;
        }
        if(this.derecho != null){
            children[1] = this.derecho;
        }
        return children;
    }

    
    public void agregar(int elemento) {
        if (elemento < dato) {
            if (izquierdo == null) {
                
                izquierdo = new Node(elemento);
                
            } 
            else {
                izquierdo.agregar(elemento);
            }

        } else {
            if (elemento > dato) {

                if (derecho == null) {
                   
                    derecho = new Node(elemento);
                   
                } 
                else {
                    derecho.agregar(elemento);
                }

            }

        }

    }

    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Node getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Node izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Node getDerecho() {
        return derecho;
    }

    public void setDerecho(Node derecho) {
        this.derecho = derecho;
    }

    public boolean isViewed() {
        return viewed;
    }


    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

}
