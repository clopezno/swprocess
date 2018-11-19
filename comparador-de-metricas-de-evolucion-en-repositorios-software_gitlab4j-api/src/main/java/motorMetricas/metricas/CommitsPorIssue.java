package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: Commits por issue.
 * <p>
 * N�mero total de commits por n�mero total de issues.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class CommitsPorIssue {
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Proceso de Orientaci�n",//categoria, 
			"CommitsPorIssue",//nombre, 
			"N�mero de commits por issue",//descripcion, 
			"�Cu�ntos commits realizados por cada issue?",//proposito, 
			"CI = NTC/NTI. NTI = Numero total de issues, NTC = N�mero total de commits",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"CI >= 0, Si se acerca a 1 se definen bien las issues, si alto: no se definen bien las issues, si bajo: desarrollo del proyecto lento",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NTI, NTC = Contador"//tipoMedida
	);
}
