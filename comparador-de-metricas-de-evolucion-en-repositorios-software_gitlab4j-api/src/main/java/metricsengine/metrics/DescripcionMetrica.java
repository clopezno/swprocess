package metricsengine.metrics;

/**
 * Descripci�n de una m�trica.
 * 
 * @author MALB
 * @since 17/11/2018
 *
 */
public class DescripcionMetrica {
	
	/**
	 * Categoria de la m�trica.
	 */
	private String categoria;

	/**
	 * Nombre de la m�trica.
	 */
	private String nombre;

	/**
	 * Descripci�n de la m�trica.
	 */
	private String descripcion;

	/**
	 * Prop�sito de la m�trica.
	 */
	private String proposito;

	/**
	 * F�rmula para calcular la m�trica.
	 */
	private String formula;

	/**
	 * Fuente d�nde se obtienen los par�metros.
	 */
	private String fuenteDeMedicion;

	/**
	 * Interpretaci�n de la m�trica.
	 */
	private String interpretacion;

	/**
	 * Tipo de escala de la m�trica.
	 */
	private String tipoEscala;

	/**
	 * Tipo de medida de la m�trica.
	 */
	private String tipoMedida;

	/**
	 * Costructor.
	 * 
	 * @param categoria Categor�a de la m�trica.
	 * @param nombre Nombre.
	 * @param descripcion Descripci�n.
	 * @param proposito Prop�sito.
	 * @param formula F�rmula para calcular la m�trica.
	 * @param fuenteDeMedicion Fuente d�nde se obtienen los par�metros.
	 * @param interpretacion Interpretaci�n de la m�trica.
	 * @param tipoEscala Tipo de escala.
	 * @param tipoMedida Tipo de medida.
	 */
	public DescripcionMetrica(String categoria, String nombre, String descripcion, String proposito, String formula,
			String fuenteDeMedicion, String interpretacion, String tipoEscala, String tipoMedida) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.proposito = proposito;
		this.formula = formula;
		this.fuenteDeMedicion = fuenteDeMedicion;
		this.interpretacion = interpretacion;
		this.tipoEscala = tipoEscala;
		this.tipoMedida = tipoMedida;
	}

	/** Obtiene la categoria de la m�trica.
	 * 
	 * @return Categoria de la m�trica.
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Obtiene el nombre de la m�trica.
	 * 
	 * @return Nombre de la m�trica.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene la descripci�n de la m�trica.
	 * 
	 * @return Descripci�n de la m�trica.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Obtiene el prop�sito de la m�trica.
	 * 
	 * @return Prop�sito de la m�trica.
	 */
	public String getProposito() {
		return proposito;
	}

	/**
	 * Obtiene la f�rmula de la m�trica.
	 * 
	 * @return F�rmula de la m�trica.
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * Obtiene la fuente de medici�n de la m�trica.
	 * 
	 * @return Fuente de medici�n.
	 */
	public String getFuenteDeMedicion() {
		return fuenteDeMedicion;
	}

	/**
	 * Obtiene la interpretaci�n de la m�trica.
	 * 
	 * @return Interpretaci�n de la m�trica.
	 */
	public String getInterpretacion() {
		return interpretacion;
	}

	/**
	 * Obtiene el tipo de escala.
	 * 
	 * @return Tipo de escala.
	 */
	public String getTipoEscala() {
		return tipoEscala;
	}

	/**
	 * Obtiene el tipo de medida.
	 * 
	 * @return Tipo de medida.
	 */
	public String getTipoMedida() {
		return tipoMedida;
	}
}
