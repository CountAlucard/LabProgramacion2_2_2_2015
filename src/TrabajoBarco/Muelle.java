
package TrabajoBarco;

import java.util.ArrayList;
import java.util.Scanner;

public class Muelle {
    static ArrayList<Barco> barcos = new ArrayList<>();
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        
        do{
            System.out.println("1- Agregar Barco");
            System.out.println("2- Agregar Elemento");
            System.out.println("3- Vaciar Barco");
            System.out.println("4- Listar Pasajeros");
            System.out.println("5- Agregar Cardumen");
            System.out.println("6- Salir");
            
            op = lea.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Nombre ");
                    String name = lea.next();
                    System.out.println("Tipo del Barco: ");
                    String tipo = lea.next();
                    agregarBarco(name, tipo.toUpperCase());
                    break;
                case 2:
                    System.out.println("Nombre");
                    name = lea.next();
                    agregarElemento(name);
                    break;
                case 3:
                    System.out.println("Nombre");
                    name = lea.next();
                    System.out.println("Total Generado: " +vaciarBarco(name));
                    break;
                case 4:
                    listarPasajeros();
                    break;
                case 5:
                    System.out.println("Nombre");
                    name = lea.next();
                    System.out.println("Cantidad: ");
                    int cant = lea.nextInt();
                    agregarCardumen(name,cant);
                    break;
            }
        }while(op!=6);
        
    }

    private static Barco search(String name)
    {
        for(Barco b: barcos){
            if(b.getNombre().equals(name))
                return b;
        }
        
        return null;
    }
    
    private static void agregarBarco(String name, String tipo) 
    {
        if(search(name) == null){
            System.out.println("Precio Elemnto: ");
            double p = lea.nextDouble();
            switch(tipo){
                case "PESQUERO":
                    barcos.add(new BarcoPesquero(name,p));
                    break;
                case "PASAJERO":
                    System.out.println("Maxima Capacidad: ");
                    int cap = lea.nextInt();
                    barcos.add(new BarcoPasajero(name,cap,p));
                    break;
            }
        }
    }

    private static void agregarElemento(String name)
    {
        Barco barco = search(name);
        if(barco != null){
            barco.agregarElemento();
        }
    }

    private static double vaciarBarco(String name)
    {
        Barco barco = search(name);
        if(barco != null){
            System.out.println(barco);
            return barco.vaciarCobrar();
        }        
        return 0;
    }

    private static void listarPasajeros()
    {
        for(Barco barco: barcos){
            if(barco instanceof BarcoPasajero){
                ((BarcoPasajero)barco).listarPasajeros();
            }
        }
    }

    private static void agregarCardumen(String name, int cant) 
    {
        Barco barco = search(name);
        if(barco instanceof BarcoPesquero){
            ((BarcoPesquero)barco).agregarCardumen(cant);
        }
    }
}
