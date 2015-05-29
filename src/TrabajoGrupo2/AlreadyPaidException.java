
package TrabajoGrupo2;

public class AlreadyPaidException extends RuntimeException{
    public AlreadyPaidException(){
        super("Prestamo Ya Pagado!");
    }
}
