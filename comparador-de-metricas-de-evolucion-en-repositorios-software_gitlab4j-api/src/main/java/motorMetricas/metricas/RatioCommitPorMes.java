package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: Ratio de commits por mes.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class RatioCommitPorMes {
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
}
