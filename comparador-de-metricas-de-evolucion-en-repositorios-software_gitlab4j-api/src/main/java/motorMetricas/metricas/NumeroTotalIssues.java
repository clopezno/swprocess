package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: N�mero total de issues.
 * <p>
 * N�mero total de issues creadas en el repositorio.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class NumeroTotalIssues {
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
}
