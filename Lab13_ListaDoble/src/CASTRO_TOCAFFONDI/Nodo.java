package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class Nodo{
    private int dato;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo(int dato){
    setDato(dato);
    anterior=null;
    siguiente=null;
    }
    
    public void setDato(int dato){
    this.dato = dato; 
    }
    
    public int getDato(){return dato;}
  
    public void setAnterior(Nodo anterior){
        this.anterior=anterior;
    }
    
    public Nodo getAnterior(){return anterior;}
  
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
  
    public Nodo getSiguiente(){return siguiente;}
}
