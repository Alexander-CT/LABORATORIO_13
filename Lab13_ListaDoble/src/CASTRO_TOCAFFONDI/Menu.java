package CASTRO_TOCAFFONDI;
//Autor: CASTRO TOCAFFONDI
import javax.swing.JOptionPane;

public class Menu {
    public Menu(){
        ListaDoble Ld=new ListaDoble();
        String mensaje="1. Agregar nodo ordenado\n";
        mensaje+="2. Agregar nodo al final\n";
        mensaje+="3. Mostrar adelante\n";
        mensaje+="4. Mostrar atras\n";
        mensaje+="5. Cantidad de nodos\n";
        mensaje+="6. Salir";
        int opcion, element;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,"MENÚ",JOptionPane.INFORMATION_MESSAGE));
            switch(opcion){
                case 1: //Insertar Ordenado
                    element=Integer.parseInt(JOptionPane.showInputDialog(null,"Digitar dato","Agregar nodo ordenado",JOptionPane.INFORMATION_MESSAGE));
                    Ld.insertarOrdenado(element);
                    break;
                case 2: //Insertar al final
                    element=Integer.parseInt(JOptionPane.showInputDialog(null,"Digitar dato","Agregar nodo al final",JOptionPane.INFORMATION_MESSAGE));
                    Ld.insertarFinal(element);
                    break;
                case 3: //Mostrar adelante
                    Ld.mostrarAdelante();
                    break;
                case 4: //Mostrar atrás
                    Ld.mostrarAtras();
                    break;
                case 5: //Cantidad de nodos
                    JOptionPane.showMessageDialog(null,"La lista tiene "+Ld.cantidad()+" nodos","Cantidad de nodos",JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }while(opcion!=6);
    }
}
