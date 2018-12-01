/**
 * 
 */
package metricsengine.metrics;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorDecimal;

/**
 * M�trica: Contador de commits en mes pico.
 * <p>
 * N�mero de commits en el mes que m�s commits se han realizado por n�mero total de commits.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class ContadorCommitsPico implements IMetric {
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Constantes de tiempo",//categoria, 
			"ContadorCommitsPico",//nombre, 
			"N�mero de commits en el mes que m�s commits se han realizado en relaci�n con el n�mero total de commits",//descripcion, 
			"�Cu�l es la proporci�n de trabajo realizado en el mes con mayor n�mero de cambios?",//proposito, 
			"CCP = NCMP / NTC. NCMP = N�mero de commits en el mes pico, NTC = N�mero total de commits",//formula,
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"0 <= CCP <= 1. Mejor valores intermedios",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NCMP, NTC = Contador"//tipoMedida
	);

	/**
	 * Par�metro NCMP: N�mero de commits en mes pico.
	 */
	private Integer ncmp = null;
	
	/**
	 * Par�metro NTC: N�mero total de commits.
	 */
	private Integer ntc = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	private Double resultado = null;
	
	/**
	 * Constructor vacio.
	 */
	public ContadorCommitsPico() {}
	
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param ncmp Par�metro NCMP: N�mero de commits en mes pico.
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public ContadorCommitsPico(Integer ncmp, Integer ntc) {
		setParametros(ncmp, ntc);
		calculate();
	}

	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param ncmp Par�metro NCMP: N�mero de commits en mes pico.
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public void setParametros(Integer ncmp, Integer ntc) {
		this.ncmp = ncmp;
		this.ntc = ntc;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	@Override
	public IValor calculate() {
		resultado = (double) (ncmp/ntc);
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
	 * Devuelve Par�metro NCMP: N�mero de commits en mes pico.
	 * 
	 * @return Par�metro NCMP: N�mero de commits en mes pico.
	 */
	public Integer getNcmp() {
		return ncmp;
	}
	
	/**
	 * Devuelve Par�metro NTC: N�mero total de commits.
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
