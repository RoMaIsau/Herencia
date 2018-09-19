package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SecretariaTest {

	@Test
	public void unaSecretariaEsUnaEmpleada() {

		Secretaria miSecretaria = new Secretaria();

		assertTrue(miSecretaria instanceof Empleado);

	}
	@Test
	public void cuandoBrindaDetalleDevuelveQueEsUnaSecretaria() {
		
		Empleado secretaria = new Secretaria();
		
		assertEquals("Soy una secretaria", secretaria.brindarDetalles());
		
	}
}
