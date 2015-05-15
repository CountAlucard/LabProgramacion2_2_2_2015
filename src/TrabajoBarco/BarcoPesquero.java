
package TrabajoBarco;


public class BarcoPesquero extends Barco{
    private int pecesCapturados;
    public double precioPorPescado;
    
    public BarcoPesquero(String nombre, double p)
    {
        super(nombre);
        precioPorPescado = p;
        pecesCapturados = 0;
    }

    @Override
    void agregarElemento() {
        pecesCapturados++;
    }

    @Override
    double vaciarCobrar() {
        double total = precioPorPescado * pecesCapturados;
        pecesCapturados = 0;
        return total;
    }

    @Override
    public String toString() {
        return "Barco Pesquero: " + super.toString() + "Peces Capturados= " +pecesCapturados; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregarCardumen(int n)
    {
        pecesCapturados +=n;
    }
    
    
    
    
    
    
}
