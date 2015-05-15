
package TrabajoBarco;

public class Cabotaje {
    public static void main(String[] args) {
        //Funciones ON-DEMAND
        Barco titanic = new Barco("Titanic"){
            public void test(){
                System.out.println("Shuu Shuu Shuu");
            }

            @Override
            void agregarElemento() {
                System.out.println("Agregando elemento");
                test();
            }

            @Override
            double vaciarCobrar() {
                return 5000;
            }
        };
    }
}
