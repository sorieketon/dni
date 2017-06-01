package dni;

import org.junit.Assert;
import org.junit.Test;

public class DniTest {

	@Test
	public void testDniCorrecto() {
		char letra = Dni.calculaLetra(11900144);
		Assert.assertEquals('J', letra);
	}

	@Test(expected = DniNegativoException.class)
	public void testDniNegativo() {
		char letra = Dni.calculaLetra(-11900144);
		Assert.assertNotEquals('J', letra);
	}

	@Test
	public void testStringDniCorrecto() {
		char letra = Dni.calculaLetra("X11900144");
		Assert.assertEquals('J', letra);

	}

	@Test(expected = DniForaneoException.class)
	public void testDniExtranjeroLetraEquivocada() {
		Dni.calculaLetra("J11900144");
		//Assert.assertEquals('J', letra);

	}
}
