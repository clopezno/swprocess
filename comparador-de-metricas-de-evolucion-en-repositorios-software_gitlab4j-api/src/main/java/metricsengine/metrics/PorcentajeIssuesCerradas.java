package metricsengine.metrics;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorDecimal;

/**
 * M�trica: Porcentaje de issues cerradas.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class PorcentajeIssuesCerradas implements IMetric {
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Proceso de Orientaci�n",//categoria, 
			"PorcentajeIssuesCerradas",//nombre, 
			"Porcentaje de issues cerradas",//descripcion, 
			"�Qu� porcentaje de issues definidas en el repositorio se han cerrado?",//proposito, 
			"PIC = NTIC*100/NTI. NTIC = N�mero total de issues cerradas, NTI = Numero total de issues",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"0 <= PIC <= 100. Cuanto m�s alto mejor.",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NTI, NTIC = Contador"//tipoMedida
	);
	
	/**
	 * Par�metro NTI: N�mero total de issues.
	 */
	private Integer nti = null;
	
	/**
	 * Par�metro NTIC: N�mero de issues cerradas.
	 */
	private Integer ntic = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	public Double resultado = null;

	/**
	 * Constructor vacio.
	 */
	public PorcentajeIssuesCerradas() {}
		
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param nti N�mero total de issues.
	 * @param ntic N�mero de issues cerradas.
	 */
	public PorcentajeIssuesCerradas(Integer nti, Integer ntic) {
		this.nti = nti;
		this.ntic = ntic;
		calculate();
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	public IValor calculate() {
		this.resultado = (double) ((ntic/nti)*100);
		return getResultado();
	}
	
	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param nti N�mero total de issues.
	 * @param ntic N�mero de issues cerradas.
	 */
	public void setParametros(Integer nti, Integer ntic) {
		this.nti = nti;
		this.ntic = ntic;
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

	/**
	 * Obtiene Par�metro: N�mero de issues cerradas.
	 * 
	 * @return Par�metro: N�mero de issues cerradas.
	 */
	public Integer getNtic() {
		return ntic;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#getResultado()
	 */
	public IValor getResultado() {
		return new ValorDecimal(resultado);
	}
}
