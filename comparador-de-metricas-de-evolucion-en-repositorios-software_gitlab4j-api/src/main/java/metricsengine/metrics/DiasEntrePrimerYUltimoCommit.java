package metricsengine.metrics;

import java.util.Date;

import metricsengine.values.IValor;
import metricsengine.values.valores.ValorEntero;

/**
 * M�trica: D�as entre primer y �ltimo commit.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class DiasEntrePrimerYUltimoCommit implements metricsengine.metrics.IMetric {
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

	/**
	 * Par�metro TC2: fecha ultimo commit.
	 */
	private Date fechaUltimoCommit = null;
	
	/**
	 * Par�metro TC1: fecha primer commit.
	 */
	private Date fechaPrimerCommit = null;
	
	/**
	 * Resultado obtenido al calcular la m�trica.
	 */
	private Integer resultado = null;
	
	/**
	 * Constructor vacio.
	 */
	public DiasEntrePrimerYUltimoCommit() {}
	
	/**
	 * Constructor que ya establece los par�metros de la m�trica y calcula el resultado.
	 * 
	 * @param fechaUltimoCommit Par�metro TC2: fecha ultimo commit.
	 * @param fechaPrimerCommit Par�metro TC1: fecha primer commit.
	 */
	public DiasEntrePrimerYUltimoCommit(Date fechaUltimoCommit, Date fechaPrimerCommit) {
		setParametros(fechaUltimoCommit, fechaPrimerCommit);
		calculate();
	}
	
	/**
	 * Establece los par�metros de la m�trica.
	 * 
	 * @param fechaUltimoCommit Par�metro TC2: fecha ultimo commit.
	 * @param fechaPrimerCommit Par�metro TC1: fecha primer commit.
	 */
	public void setParametros(Date fechaUltimoCommit, Date fechaPrimerCommit) {
		this.fechaUltimoCommit = fechaUltimoCommit;
		this.fechaPrimerCommit = fechaPrimerCommit;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#calcularMetrica()
	 */
	@Override
	public IValor calculate() {
		this.resultado = (int) (fechaUltimoCommit.getTime() - fechaUltimoCommit.getTime());
		return getResultado();
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
	 * Devuelve Par�metro TC2: fecha ultimo commit.
	 * 
	 * @return Par�metro TC2: fecha ultimo commit.
	 */
	public Date getFechaUltimoCommit() {
		return fechaUltimoCommit;
	}
	
	/**
	 * Devuelve Par�metro TC1: fecha primer commit.
	 * 
	 * @return Par�metro TC1: fecha primer commit.
	 */
	public Date getFechaPrimerCommit() {
		return fechaPrimerCommit;
	}
	
	/* (non-Javadoc)
	 * @see motorMetricas.defMetricas.IMetrica#getResultado()
	 */
	@Override
	public IValor getResultado() {
		return new ValorEntero(resultado);
	}


	
	
}
