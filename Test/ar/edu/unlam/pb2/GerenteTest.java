package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GerenteTest {
	
	@Test
	public void unGerenteEsUnEmpleado() {
		
		Gerente miGerente = new Gerente();
		
		assertTrue(miGerente instanceof Empleado);
	}
	
	@Test
	public void cuandoBrindaDetalleDevuelveQueEsUnGerente() {
		
		Empleado gerente = new Gerente();
		
		assertEquals("Soy un gerente", gerente.brindarDetalles());
		
	}
}
