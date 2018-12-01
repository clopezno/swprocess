package metricsengine.metrics;

import java.util.ArrayList;
import java.util.List;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorDecimal;

/**
 * M�trica: Media de d�as que se tarda en cerrar una issue.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class MediaDiasCerrarIssue implements IMetric{
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Constantes de tiempo",//categoria, 
			"MediaDiasCerrarIssue",//nombre, 
			"Media de dias que se tarda en cerrar una Issue",//descripcion, 
			"�Cu�nto se tarda de media en cerrar una Issue?",//proposito, 
			"MDCI = [Sumatorio de (TFi - TIi) i = 0 hasta i = NTIC] / NTIC. NTIC = N�mero de issues cerradas, TF = tiempo de cierre del issue, TI = tiempo de inicio del issue",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"MDCI >= 0. Cu�nto m�s peque�o mejor",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NTIC = Contador; TF, TI = Tiempo"//tipoMedida
	);
	
	/**
	 * Par�metro diasEnCerrarIssues: Conjunto de d�as que han pasado abiertas las issues ya cerradas.
	 */
	private List<Integer> diasEnCerrarIssues = new ArrayList<Integer>();

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
	public MediaDiasCerrarIssue() {}
	
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param diasEnCerrarIssues Par�metro diasEnCerrarIssues: Conjunto de d�as que han pasado abiertas las issues ya cerradas.
	 * @param ntic Par�metro NTIC: N�mero de issues cerradas.
	 */
	public MediaDiasCerrarIssue(List<Integer> diasEnCerrarIssues, Integer ntic) {
		this.diasEnCerrarIssues = diasEnCerrarIssues;
		this.ntic = ntic;
		calculate();
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	public IValor calculate() {
		Integer sumaDias = diasEnCerrarIssues.stream().reduce(0, Integer::sum);
		this.resultado = (double) (sumaDias / ntic);
		return getResultado();
	}
	
	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param diasEnCerrarIssues Par�metro diasEnCerrarIssues: Conjunto de d�as que han pasado abiertas las issues ya cerradas.
	 * @param ntic Par�metro NTIC: N�mero de issues cerradas.
	 */
	public void setParametros(List<Integer> diasEnCerrarIssues, Integer ntic) {
		this.diasEnCerrarIssues = diasEnCerrarIssues;
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
	public List<Integer> getDiasEnCerrarIssues() {
		return diasEnCerrarIssues;
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
	@Override
	public IValor getResultado() {
		return new ValorDecimal(resultado);
	}
}
	