package metricsengine.metrics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorDecimal;

/**
 * Media de d�as que pasan entre commits.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class MediaDiasEntreCommits implements metricsengine.metrics.IMetric{
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

	/**
	 * Par�metro: Fechas de creaci�n de todos los commits.
	 */
	private List<Date> fechasCommits = new ArrayList<Date>();
	
	/**
	 * Par�metro NTC: N�mero total de commits.
	 */
	private Integer ntc = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	private Double resultado = null;
	
	/**
	 * Constructor vacio.
	 */
	public MediaDiasEntreCommits() {}
	
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param fechasCommits Par�metro: Fechas de creaci�n de todos los commits.
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public MediaDiasEntreCommits(List<Date> fechasCommits, Integer ntc) {
		setParametros(fechasCommits, ntc);
		calculate();
	}

	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	@Override
	public IValor calculate() {
		try {
			List<Integer> diasEntreCommits = new ArrayList<Integer>();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			fechasCommits = fechasCommits.stream().sorted().collect(Collectors.toList());
			for (int i = 0, j = 1; j < fechasCommits.size(); i++, j++) {
				Date fechaInicial = dateFormat.parse(fechasCommits.get(i).toString());
				Date fechaFinal = dateFormat.parse(fechasCommits.get(j).toString());
				Integer dias = (int) (fechaFinal.getTime() - fechaInicial.getTime());
				diasEntreCommits.add(dias);
			}
			Integer sumDias = diasEntreCommits.stream().reduce(0, Integer::sum);
			this.resultado = (double) (sumDias / ntc);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getResultado();
	}

	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param fechasCommits Par�metro: Fechas de creaci�n de todos los commits.
	 * @param ntc Par�metro NTC: N�mero total de commits.
	 */
	public void setParametros(List<Date> fechasCommits, Integer ntc) {
		this.fechasCommits = fechasCommits;
		this.ntc = ntc;
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
	 * Obtiene Par�metro: Fechas de creaci�n de todos los commits.
	 * 
	 * @return Par�metro: Fechas de creaci�n de todos los commits.
	 */
	public List<Date> getFechasCommits() {
		return fechasCommits;
	}

	/**
	 * Obtiene Par�metro: N�mero total de commits.
	 * 
	 * @return Par�metro: N�mero total de commits.
	 */
	public Integer getNtc() {
		return ntc;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#getResultado()
	 */
	@Override
	public IValor getResultado() {
		return new ValorDecimal(resultado);
	}
	
}
