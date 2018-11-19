/**
 * 
 */
package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: Contador de commits en mes pico.
 * <p>
 * N�mero de commits en el mes que m�s commits se han realizado por n�mero total de commits.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class ContadorCommitsPico {
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
}
