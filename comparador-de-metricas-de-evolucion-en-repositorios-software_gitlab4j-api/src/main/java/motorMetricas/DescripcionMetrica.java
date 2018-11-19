package motorMetricas;

/**
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
	 * Descripcion de la m�trica.
	 */
	private String descripcion;

	/**
	 * Proposito de la m�trica.
	 */
	private String proposito;

	/**
	 * Formula de la m�trica.
	 */
	private String formula;

	/**
	 * Fuente de medici�n de la m�trica.
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
	 * Tipo de medida de la m�trica..
	 */
	private String tipoMedida;

	/**
	 * @param categoria
	 * @param nombre
	 * @param descripcion
	 * @param proposito
	 * @param formula
	 * @param fuenteDeMedicion
	 * @param interpretacion
	 * @param tipoEscala
	 * @param tipoMedida
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

	public String getCategoria() {
		return categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getProposito() {
		return proposito;
	}

	public String getFormula() {
		return formula;
	}

	public String getFuenteDeMedicion() {
		return fuenteDeMedicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public String getTipoEscala() {
		return tipoEscala;
	}

	public String getTipoMedida() {
		return tipoMedida;
	}
	
}
