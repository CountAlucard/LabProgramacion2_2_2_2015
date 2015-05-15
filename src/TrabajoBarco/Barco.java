
package TrabajoBarco;

import java.util.Date;

public abstract class Barco {
    protected String nombre;
    protected Date fecha;
    
    public Barco(String n)
    {
        nombre = n;
        fecha.toString();
    }

    public String getNombre() 
    {
        return nombre;
    }

    public Date getFecha() 
    {
        return fecha;
    }

    @Override
    public String toString() 
    {
        return "Barco: " + "Nombre= " + nombre + ", Fecha de Ingreso= " + fecha + '}';
    }
    
    abstract void agregarElemento();
        
    abstract double vaciarCobrar();
    
}
