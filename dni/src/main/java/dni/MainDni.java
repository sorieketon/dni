package dni;

public class MainDni {
	public static void main(String[] args){
		char letra;
		try {
			letra = Dni.calculaLetra("X11900144");
			System.out.println("La letra es " + letra );
		} catch (DniNegativoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
