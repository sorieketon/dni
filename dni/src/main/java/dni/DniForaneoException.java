package dni;

public class DniForaneoException /*extends es una palabra clave*/extends RuntimeException /*exception esta predefinida por el programa*/{
	
	private static final String MENSAJE_ERROR = "Formato de Dni extranjero espera X";
	public DniForaneoException (){
		/*palabra reservada para llamar al mismo metodo pero padre, la clase de arriba
		 */
		super (MENSAJE_ERROR);
	}
	

}
