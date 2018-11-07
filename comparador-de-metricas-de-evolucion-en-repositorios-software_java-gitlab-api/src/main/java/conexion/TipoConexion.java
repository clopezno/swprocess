package conexion;

/**
 * Tipos de conexi�n.
 * 
 * @author MALB
 * @since 01/11/2018
 */
public enum TipoConexion {
	/**
	 * Conexi�n con el API, autenticando un usuario mediante alg�n m�todo de autenticaci�n.
	 */
	AUTENTICADA,
	
	/**
	 * Conexi�n con el API sin autenticar.
	 * <p>
	 * Solo permite acceder a repositorios p�blicos.
	 */
	SIN_AUTENTICAR
}
