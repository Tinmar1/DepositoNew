package cuentas;

/**
 * Esta clase simula una cuenta bancaria.
 * 
 * @author Martin
 * @version 2.0
 * @since 1.0
 * 
 */
public class CCuenta {

/**
 * Atributos de la clase.
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter;

/**
 * Constructor sin par�metros.
 */
    public CCuenta()
    {
    }

/**
 * Constructor con todos los par�metros.
 * @param nom es el nombre del titular
 * @param cue es el n�mero de la cuenta
 * @param sal es la cantidad de dinero que hay en la cuenta
 * @param tipo es el tipo de inter�s de la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/**
 * M�todo que devuelve el saldo de la cuenta.
 * @return saldo
 */
    public double estado()
    {
        return getSaldo();
    }

/**
 * M�todo para realizar un ingreso en la cuenta.
 * @param cantidad es el dinero que se va a ingresar en la cuenta
 * @throws Exception cuando se trata de ingresar una cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

 /**
  * M�todo para retirar una cantidad de la cuenta.
  * @param cantidad es el dinero que se quiere retirar
  * @throws Exception cuando la cantidad sea negativa
  * @throws Exception cuando la cantidad sea mayor de el dinero que hay en la cuenta
  */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

/**
 * M�todo para obtener el nombre
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}

/**
 * M�todo para asignar una cadena de texto al nombre
 * @param nombre String con el titular de la cuenta
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
* M�todo para obtener el n�mero de cuenta
* @return cuenta
*/
	private String getCuenta() {
		return cuenta;
	}

/**
 * M�todo para asignar una cadena de texto a cuenta
 * @param cuenta string con el n�mero de cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

/**
* M�todo para obtener el saldo
* @return saldo
*/
	private double getSaldo() {
		return saldo;
	}

/**
 * M�todo para asignar un valor al saldo
 * @param saldo valor de la cantidad de dinero en la cuenta
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/**
* M�todo para obtener el tipo de inter�s
* @return tipoInter
*/
	private double getTipoInter() {
		return tipoInter;
	}

/**
 * M�todo para asignar un valor al tipoInter
 * @param tipoInter valor del tipo de inter�s de la cuenta
 */
	private void setTipoInter(double tipoInter) {
		this.tipoInter = tipoInter;
	}
}
