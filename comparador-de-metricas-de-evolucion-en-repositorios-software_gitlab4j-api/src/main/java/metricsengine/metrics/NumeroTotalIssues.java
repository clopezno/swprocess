package metricsengine.metrics;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorEntero;

/**
 * M�trica: N�mero total de issues.
 * <p>
 * N�mero total de issues creadas en el repositorio.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class NumeroTotalIssues implements IMetric{
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Proceso de Orientaci�n",//categoria, 
			"NumeroTotalIssues",//nombre, 
			"N�mero total de issues creadas en el repositorio",//descripcion, 
			"�Cu�ntas issues se han definido en el repositorio?",//prop�sito, 
			"NTI. NTI = n�mero total de issues",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"NTI >= 0. Mejor valores bajos",//interpretaci�n, 
			"Absoluta",//tipoEscala, 
			"NTI = Contador"//tipoMedida
	);
	
	/**
	 * Par�metro NTI: N�mero total de issues.
	 */
	private Integer nti = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	public Integer resultado = null;
	
	/**
	 * Constructor vacio.
	 */
	public NumeroTotalIssues() {}
	
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param nti N�mero total de issues.
	 */
	public NumeroTotalIssues(Integer nti) {
		setParametros(nti);
		calculate();
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	public IValor calculate() {
		this.resultado = nti;
		return getResultado();
	}
	
	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param nti N�mero total de issues.
	 */
	public void setParametros(Integer nti) {
		this.nti = nti;
	}

	/**
	 * Devuelve la descripci�n de la m�trica.
	 * 
	 * @return Descripci�n de la m�trica.
	 */
	public static DescripcionMetrica getDescripcion() {
		return descripcion;
	}

	/**
	 * Obtiene Par�metro: N�mero total de issues.
	 * 
	 * @return Par�metro: N�mero total de issues.
	 */
	public Integer getNti() {
		return nti;
	}

	/* (non-Javadoc)
	 * @see motorMetricas.metricas.IMetrica#getResultado()
	 */
	public IValor getResultado() {
		return new ValorEntero(resultado);
	}
}