package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * M�trica: D�as entre primer y �ltimo commit.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class DiasEntrePrimerYUltimoCommit {
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Constantes de tiempo",//categoria, 
			"DiasEntrePrimerYUltimoCommit",//nombre, 
			"D�as transcurridos entre el primer y el ultimo commit",//descripcion, 
			"�Cuantos d�as han pasado entre el primer y el �ltimo commit?",//proposito, 
			"DEPUC = TC2- TC1. TC2 = Tiempo de �ltimo commit, TC1 = Tiempo de primer commit.",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"DEPUC >= 0",//interpretacion, 
			"Absoluta",//tipoEscala, 
			"TC = Tiempo"//tipoMedida
	);
}
