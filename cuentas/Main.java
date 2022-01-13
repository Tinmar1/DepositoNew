package cuentas;

/**
 * Clase para arrancar el programa.
 * 
 * @author Martin
 * @version 2.0
 * @since 1.0
 */
public class Main {

/**
 * Método main
 * @param args argumentos
 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta(2500);
    }

 /**
  * Método para realizar operaciones sobre un objeto CCuenta.
  * @param cantidad valor del saldo con el que se crea la cuenta
  */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;		
		cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",cantidad,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
