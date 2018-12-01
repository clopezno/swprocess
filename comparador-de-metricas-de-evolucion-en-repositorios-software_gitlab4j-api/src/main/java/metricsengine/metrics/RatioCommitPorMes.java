package metricsengine.metrics;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorDecimal;

/**
 * M�trica: Ratio de commits por mes.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class RatioCommitPorMes implements IMetric {
	
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Constantes de tiempo",//categoria, 
			"RatioCommitPorMes",//nombre, 
			"Muestra el n�mero de commits relativos al n�mero de meses",//descripcion, 
			"�Cu�l es el n�mero medio de cambios por mes?",//proposito, 
			"RCM = NTC / 12",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"RCM > 0. Cuanto m�s alto mejor",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NTC = Contador"//tipoMedida
	);

	/**
	 * Par�metro NTC: N�mero total de commits.
	 */
	private Integer ntc = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	private Double resultado = null;
	
	
	
	public RatioCommitPorMes() {}
	
	
	
	public RatioCommitPorMes(Integer ntc) {
		setParametros(ntc);
	}

	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public void setParametros(Integer ntc) {
		this.ntc = ntc;
	}

	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	@Override
	public IValor calculate() {
		resultado = (double) (ntc/12);
		return getResultado();
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
	 * Par�metro NTC: N�mero total de commits.
	 * 
	 * @return Par�metro NTC: N�mero total de commits.
	 */
	public Integer getNtc() {
		return ntc;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#getResultado()
	 */
	@Override
	public IValor getResultado() {
		return new ValorDecimal(resultado);
	}
}
