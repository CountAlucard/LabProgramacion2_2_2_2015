package TrabajoBarco;

import java.util.Scanner;

public class BarcoPasajero extends Barco{  
    private String pasajeros[];
    private double precio;
    private int contador;
    
    public BarcoPasajero(String n, int max, double p)
    {
        super(n);
        precio = p;
        pasajeros = new String[max];
        contador = 0;
    }

    @Override
    void agregarElemento() {
        Scanner lea = new Scanner(System.in);
        if(contador < pasajeros.length){
            System.out.println("Ingrese nombre de pasajero");
            pasajeros[contador++] = lea.next();
        }        
    }

    @Override
    double vaciarCobrar() {
        return vaciarCobrar();
    }
    
    public void listarPasajeros()
    {
        System.out.println("Listado de Pasajeros del Barco: \n");
        for(int p = 0; p < pasajeros.length; p++){
            System.out.println(pasajeros[p]);
        }
    }
    
    
    
    
        
}
