package clases;

/**
 * Clases con funciones para realizar diversas operaciones matematicas con dos
 * números proporcionados por el usuario.
 */
public class Operaciones {

	/**
	 * Primer número utilizado en las operaciones.
	 */
	double num1;

	/**
	 * Segundo número utilizado en las operaciones.
	 */
	double num2;

	/**
	 * Clase predeterminada, que inicializa los números a 0 por defecto.
	 */
	public Operaciones() {

	}

	/**
	 * Función que permite especificar tanto el valor del número 1 como el número 2.
	 * 
	 * @param num1 El primer número utilizado para las operaciones.
	 * @param num2 El segundo número utilizado para las operaciones.
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Esta función calcula la suma de los dos números.
	 * 
	 * @return Devuelve la suma mediante las siguientes operaciones matematicas,
	 *         número 1 mas número 2.
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Esta función calcula la resta de los dos números.
	 * 
	 * @return Devuelve la resta mediante las siguientes operaciones matematicas,
	 *         número 1 menos número 2.
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Esta función calcula la multiplicación de los dos números.
	 * 
	 * @return Devuelve la multiplicación mediante las siguientes operaciones
	 *         matematicas, número 1 por número 2.
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Esta función calcula la división de los dos números.
	 * 
	 * @return Devuelve la división mediante las siguientes operaciones matematicas,
	 *         número 1 entre número 2. Si el número 2 es 0, devuelve 0.
	 */
	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 * Esta función devuelve el mínimo de los dos números.
	 * 
	 * @return Devuelve el mínimo entre el primer y segundo número.
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Esta función devuelve el máximo de los dos números.
	 * 
	 * @return Devuelve el máximo entre el primer y el segundo número.
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
