package cuentas;

/**
 * Clase CCuenta que representa una cuenta bancaria
 * 
 * @author debian
 * @version 1.0
 * @since 20/01/2023
 */
public class CCuenta {

	/**
	 * Atrubutos de la clase
	 */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Devuelve el nombre del titular de la cuenta
	 * 
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular de la cuenta
	 * 
	 * @param nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de cuenta
	 * 
	 * @return número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el número de cuenta
	 * 
	 * @param cuenta número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo actual de la cuenta
	 * 
	 * @return saldo actual
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo actual de la cuenta
	 * 
	 * @param saldo actual
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve la tasa de interés de la cuenta
	 * 
	 * @return tasa de interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establece la tasa de interés de la cuenta
	 * 
	 * @param tipoInterés tasa de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Constructor vacío para la clase CCuenta
	 */
	public CCuenta() {
	}

	/**
	 * Constructor para inicializar los atributos de la clase CCuenta
	 * 
	 * @param nom  nombre del titular
	 * @param cue  número de cuenta
	 * @param sal  saldo actual
	 * @param tipo tasa de interés
	 */

	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/**
	 * Devuelve el saldo actual de la cuenta
	 * 
	 * @return saldo actual
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Ingresa una cantidad a la cuenta
	 * 
	 * @param cantidad cantidad a ingresar
	 * @throws Exception si la cantidad es negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Retira una cantidad de la cuenta
	 * 
	 * @param cantidad cantidad a retirar
	 * @throws Exception si la cantidad es negativa o si no hay suficiente saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
