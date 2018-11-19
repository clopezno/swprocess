package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: Media de d�as que se tarda en cerrar una issue.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class MediaDiasCerrarIssue {
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
}
