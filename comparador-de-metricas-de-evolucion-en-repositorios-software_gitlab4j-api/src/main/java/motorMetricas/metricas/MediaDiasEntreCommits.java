package motorMetricas.metricas;

import motorMetricas.DescripcionMetrica;

/**
 * Media de d�as que pasan entre commits.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class MediaDiasEntreCommits {
	/**
	 * Descripci�n de la m�trica.
	 */
	public static final DescripcionMetrica descripcion = new DescripcionMetrica(
			"Constantes de tiempo",//categoria, 
			"MediaDiasEntreCommits",//nombre, 
			"Media de d�as que pasan entre dos commits consecutivos",//descripcion, 
			"�C�anto tiempo suele pasar desde un commit hasta el siguiente?",//proposito, 
			"MDEC = [Sumatorio de (TCi-TCj) desde i=1, j=0 hasta i=NTC] / NTC. NTC = N�mero total de commits, TC = Tiempo de Commit",//formula, 
			"Repositorio de un gestor de repositorios",//fuenteDeMedicion, 
			"MDEC > 0. Cuanto m�s peque�o mejor.",//interpretacion, 
			"Ratio",//tipoEscala, 
			"NTC = Contador; TC = Tiempo"//tipoMedida
	);
}
