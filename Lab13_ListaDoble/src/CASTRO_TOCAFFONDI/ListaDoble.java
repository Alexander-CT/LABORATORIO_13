package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
public class ListaDoble{
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaDoble(){
        primero=null;
        ultimo=null;
    }
    public boolean esVacia(){
        return primero==null;
    }
  
    public void insertarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if(!esVacia()){
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo=nuevo;
        }else{//si no existe ningún nodo
            primero=nuevo;
            ultimo=nuevo;
        }
    }
  
    public void insertarOrdenado(int dato){
        Nodo nuevo = new Nodo(dato);
        if(esVacia()){
        primero=nuevo;
        ultimo=nuevo;
        }else{
            if(dato<primero.getDato()){
                nuevo.setSiguiente(primero);
                primero.setAnterior(nuevo);
                primero=nuevo;
            }else{ //¿si dato >= el contenido del primer nodo?
                Nodo antes = primero;
                Nodo despues = primero.getSiguiente();
                while((despues!=null)&&(dato>despues.getDato())){
                    antes=despues;
                    despues=despues.getSiguiente();
                }
                antes.setSiguiente(nuevo);
                nuevo.setAnterior(antes);
                if(despues==null){
                    //antes.setSiguiente(nuevo);
                    //nuevo.setAnterior(antes);
                    ultimo=nuevo;
                }else{
                    //antes.setSiguiente(nuevo);
                    //nuevo.setAnterior(antes);
                    nuevo.setSiguiente(despues);
                    despues.setAnterior(nuevo);
                }
            }
        }
    }
    public void mostrarAdelante(){
        if(!esVacia()){
            Nodo aux=primero;
            while(aux!=null){
            System.out.print(aux.getDato()+" - ");
            aux=aux.getSiguiente();
            }
        System.out.println("");
        }
    }
    public void mostrarAtras(){
        if(!esVacia()){
        Nodo aux=ultimo;
        while(aux!=null){
            System.out.print(aux.getDato()+" - ");
            aux=aux.getAnterior();
        }
        System.out.println("");
    }
  }
    public int cantidad(){
        int contador=0;
        if(!esVacia()){
            Nodo aux=ultimo;
            while(aux!=null){
                contador++;
                aux=aux.getAnterior();
            }
        }
        return contador;
    }
}
