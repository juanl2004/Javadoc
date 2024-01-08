package clases;

/**
 * Clase con funciones para generar las partes que necesitamos para representar
 * una esfera.
 */
public class Esfera {

	/**
	 * Radio de la esfera, por defecto, se inicializa en 1.0 .
	 */
	double radio = 1.0;

	/**
	 * Esta función inicializa una esfera con radio 1.0 .
	 */
	public Esfera() {
		super();
	}

	/**
	 * Esta función nos permite crear el radio y modificarlo segun el tamaño del
	 * mismo en diferentes ocasiones.
	 * 
	 * @param radio El radio de la esfera.
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}

	/**
	 * Esta función se encarga de calcular mediante ecuaciones matematicas la
	 * superficie de la esfera y de devolver el resultado.
	 * 
	 * @return Devuelve la superficie de la esfera, del siguiente modo, 4 por PI por
	 *         el radio de la esfera al cuadrado.
	 */
	public double superficie() {
		double superficie = 4 * Math.PI * Math.pow(radio, 2);
		return superficie;
	}

	/**
	 * Esta función se encarga de calcular mediante una serie de operaciones
	 * matematicas el volumen de la esfera y devuelve el resultado obtenido.
	 * 
	 * @return Devuelve el volumen de la esfera, mediante las siguientes
	 *         operaciones, entre parentesis () 4 por PI partido entre 3, por el
	 *         radio de la esfera al cubo.
	 */
	public double volumen() {
		double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
		return volumen;
	}
}
