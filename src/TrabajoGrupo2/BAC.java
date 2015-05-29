
package TrabajoGrupo2;

import java.util.ArrayList;
import java.util.Scanner;

public class BAC {       
    static ArrayList<Prestamo> Prestamos;
    
    public static Prestamo search(int code)
    {
        for(Prestamo pe: Prestamos){
            if(pe.getCodigoPrestamo() == code)
                return pe;
        }        
        return null;
    }
    
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);         
        Prestamos = new ArrayList<>();
        boolean banco = true;
        
        try{
        
            do{

                System.out.println("\nBienvenido a BAC");
                System.out.println("----------------");
                System.out.println("1- Agregar Prestamos");
                System.out.println("2- Pagar Cuota");
                System.out.println("3- Ver Informacion de Prestamo");
                System.out.println("4- Salir");

                int op = lea.nextInt();

                switch(op){
                    case 1:
                        System.out.println("Ingrese el codigo para el prestamo: ");
                        int codigo = lea.nextInt();
                        System.out.println("Ingrese el nombre del cliente: ");
                        String cliente = lea.next();
                        System.out.println("Ingrese el monto del prestamo");
                        double monto = lea.nextDouble();

                        try{
                            Prestamos.add(new Prestamo(codigo, cliente, monto));
                            System.out.println("Prestamo agregado exitosamente!");
                            break;
                        }
                        catch(LoanInvalidException e){
                            System.err.println("Error: " +e.getMessage());
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el codigo del prestamo a pagar: ");
                        int codigoB = lea.nextInt();

                        if(search(codigoB) != null){
                            System.out.println("Ingrese el monto a pagar: ");
                            double pago = lea.nextDouble();

                            try{
                                Prestamo p = search(codigoB);
                                p.pay(pago);
                                System.out.println("Pago realizado con exito!");
                                break;
                            }
                            catch(AlreadyPaidException e){
                                System.out.println("El prestamo ya ha sido cancelado.");
                            }
                        } 
                        else
                            System.out.println("Prestamo no existente.");
                        break;   

                    case 3:
                        System.out.println("Ingrese el codigo del prestamo a mostrar: ");
                        int codigoC = lea.nextInt();
                        if(search(codigoC) != null){
                            Prestamo p = search(codigoC);
                            p.print();                    
                        }
                        else
                            System.out.println("Prestamo no existente.");
                        break;
                    case 4:
                        System.exit(0);
                }

            }while(banco);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
