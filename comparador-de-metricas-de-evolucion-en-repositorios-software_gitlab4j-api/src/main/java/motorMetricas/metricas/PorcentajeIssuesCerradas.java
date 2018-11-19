package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: Porcentaje de issues cerradas.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class PorcentajeIssuesCerradas {
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
}
