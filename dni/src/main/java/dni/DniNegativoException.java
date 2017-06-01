package dni;

public class DniNegativoException /*extends es una palabra clave*/extends RuntimeException /*exception esta predefinida por el programa*/{
	
	private static final String MENSAJE_ERROR = "No se admiten números negativos";
	public DniNegativoException (){
		/*palabra reservada para llamar al mismo metodo pero padre, la clase de arriba
		 */
		super (MENSAJE_ERROR);
	}
	

}
