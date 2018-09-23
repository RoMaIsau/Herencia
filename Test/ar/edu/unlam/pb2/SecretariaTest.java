package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SecretariaTest {

	@Test
	public void unaSecretariaEsUnaEmpleada() {

		Secretaria miSecretaria = new Secretaria("Maria", 25000d, 1986, 6, 8);

		assertTrue(miSecretaria instanceof Empleado);

	}
	@Test
	public void cuandoBrindaDetalleDevuelveQueEsUnaSecretaria() {
		
		Empleado secretaria = new Secretaria("Maria", 25000d, 1986, 6, 8);
		
		assertEquals("Soy una secretaria", secretaria.brindarDetalles());
		
	}
}
