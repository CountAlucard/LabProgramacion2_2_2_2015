
package TrabajoGrupo2;

public class LoanInvalidException extends Exception{
    public LoanInvalidException(double m){
        super("El prestamo por "+m+" no es aceptado.");
    }
}
