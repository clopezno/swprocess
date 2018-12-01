package metricsengine.metrics;

import metricsengine.values.IValor;

/**
 * Funciones esenciales de na m�trica.
 * 
 * @author MALB
 * @since 22/11/2018
 */
public interface IMetric {
	
	/**
	 * Calcula y devuelve el resultado de la m�trica.
	 * 
	 * @return Resultado de la m�trica.
	 */
	IValor calculate();
}
