package metricsengine.metrics;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorDecimal;

/**
 * M�trica: Commits por issue.
 * <p>
 * N�mero total de commits por n�mero total de issues.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class CommitsPorIssue implements IMetric{
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Proceso de Orientaci�n",//categoria, 
			"CommitsPorIssue",//nombre, 
			"N�mero de commits por issue",//descripcion, 
			"�Cu�ntos commits realizados por cada issue?",//proposito, 
			"CI = NTI/NTC. NTI = Numero total de issues, NTC = N�mero total de commits",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"CI >= 0, Mejor valores cercanos a 1",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NTI, NTC = Contador"//tipoMedida
	);
	
	/**
	 * Par�metro NTI: N�mero total de issues.
	 */
	public Integer nti = null;
	
	/**
	 * Par�metro NTC: N�mero total de commits.
	 */
	public Integer ntc = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	public Double resultado = null;
	
	/**
	 * Constructor vacio.
	 */
	public CommitsPorIssue() {}
	
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param nti Par�metro NTI: N�mero total de issues.
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public CommitsPorIssue(Integer nti, Integer ntc) {
		setParametros(nti, ntc);
		calculate();
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	public IValor calculate() {
		this.resultado = (double) (nti/ntc);
		return getResultado();
	}
	
	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param nti Par�metro NTI: N�mero total de issues.
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public void setParametros(Integer nti, Integer ntc) {
		this.nti = nti;
		this.ntc = ntc;
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
	 * Obtiene Par�metro NTI: N�mero total de issues.
	 * 
	 * @return Par�metro NTI: N�mero total de issues.
	 */
	public Integer getNti() {
		return nti;
	}

	/**
	 * Obtiene Par�metro NTC: N�mero total de commits.
	 * 
	 * @return Par�metro NTC: N�mero total de commits.
	 */
	public Integer getNtc() {
		return ntc;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#getResultado()
	 */
	public IValor getResultado() {
		return new ValorDecimal(resultado);
	}
}
