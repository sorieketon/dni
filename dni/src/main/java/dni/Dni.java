package dni;

public class Dni {
	private static final String JUEGO_CARACTERES_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final int NUM_LETRAS = 23;

	/*-1 es solo un valor inicial*/

	public static char calculaLetra(int dni) throws DniNegativoException {
		char letra_devuelta = ' ';

		if (dni < 0) {
			throw new DniNegativoException();
		}
		int modulo = -1;
		modulo = dni % NUM_LETRAS;
		letra_devuelta = JUEGO_CARACTERES_DNI.charAt(modulo);
		return letra_devuelta;

		/*
		 * String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		 * int modulo = dni
		 * % 23; char letra = juegoCaracteres.charAt(modulo); 
		 * return letra;
		 */
	}

	public static char calculaLetra(String dni){
		char letra_devuelta = ' ';
		char primera_letra = ' ';
		
		primera_letra = dni.charAt(0);
		String dniN = dni.substring(1);
		if(primera_letra != 'X'){
			throw new DniForaneoException();
		}
		int dniM = Integer.parseInt(dniN);
		
		letra_devuelta = calculaLetra(dniM);
		
		/*
		modulo = dniM % NUM_LETRAS;
		letra_devuelta = JUEGO_CARACTERES_DNI.charAt(modulo);
		*/

		return letra_devuelta;
	}
}
