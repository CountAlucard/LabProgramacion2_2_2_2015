
package TrabajoGrupo2;

public interface Loanable {
    void pay(double monto) throws AlreadyPaidException;
    double balanceDue();
}
