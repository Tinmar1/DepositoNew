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
 * Constructor sin parámetros.
 */
    public CCuenta()
    {
    }

/**
 * Constructor con todos los parámetros.
 * @param nom es el nombre del titular
 * @param cue es el número de la cuenta
 * @param sal es la cantidad de dinero que hay en la cuenta
 * @param tipo es el tipo de interés de la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/**
 * Método que devuelve el saldo de la cuenta.
 * @return saldo
 */
    public double estado()
    {
        return getSaldo();
    }

/**
 * Método para realizar un ingreso en la cuenta.
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
  * Método para retirar una cantidad de la cuenta.
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
 * Método para obtener el nombre
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}

/**
 * Método para asignar una cadena de texto al nombre
 * @param nombre String con el titular de la cuenta
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

/**
* Método para obtener el número de cuenta
* @return cuenta
*/
	private String getCuenta() {
		return cuenta;
	}

/**
 * Método para asignar una cadena de texto a cuenta
 * @param cuenta string con el número de cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

/**
* Método para obtener el saldo
* @return saldo
*/
	private double getSaldo() {
		return saldo;
	}

/**
 * Método para asignar un valor al saldo
 * @param saldo valor de la cantidad de dinero en la cuenta
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

/**
* Método para obtener el tipo de interés
* @return tipoInter
*/
	private double getTipoInter() {
		return tipoInter;
	}

/**
 * Método para asignar un valor al tipoInter
 * @param tipoInter valor del tipo de interés de la cuenta
 */
	private void setTipoInter(double tipoInter) {
		this.tipoInter = tipoInter;
	}
}
