package conexion;

/**
 * Tipos de autenticaci�n.
 * 
 * @author MALB
 * @since 13/11/2018
 *
 */
public enum EnumTipoAutenticaci�n {
	/**
	 * Conexi�n no autenticada.
	 */
	SIN_AUTENTICAR,
	/**
	 * Login mediante usuario y contrase�a.
	 */
	USUARIO_CONTRASENIA,
	/**
	 * Login mediante token.
	 */
	TOKEN
}
