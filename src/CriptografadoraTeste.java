import static org.junit.Assert.*;

import org.junit.Test;

public class CriptografadoraTeste {

	@Test
	public void testeConversaoLetraA() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('A');
		assertEquals(valorConvertido, 19);
	}
	
	@Test
	public void testeConversaoLetraB() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('B');
		assertEquals(valorConvertido, 11);
	}
	
	@Test
	public void testeConversaoLetraC() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('C');
		assertEquals(valorConvertido, 71);
	}
	
	@Test
	public void testeConversaoLetra$() {
		Criptografadora criptografador = new Criptografadora();
		int valorConvertido = criptografador.criptografa('$');
		assertEquals(valorConvertido, 0);
	}
}
