package conexion;

/**
 * F�brica de conexi�n a los APIs.
 * 
 * @author MALB
 * @since 13/11/2018
 */
public interface IFabricaConexion {
	
	/**
	 * Establece una conexi�n con un API.
	 * 
	 * @param tipoDeConexion Tipo de conexi�n.
	 * @param args Argumentos para establecer una conexi�n: token, usuario y contrase�a, etc.
	 * @return Conexi�n con el API.
	 */
	IConexionAPI establecerConexion(EnumTipoAutenticaci�n tipoAutenticacion, String[] args);
}
