package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GerenteTest {
	
	@Test
	public void unGerenteEsUnEmpleado() {
		
		Gerente miGerente = new Gerente("Ventas", "Aldana", 50000d, 1970, 5, 12);
		
		assertTrue(miGerente instanceof Empleado);
	}
	
	@Test
	public void cuandoBrindaDetalleDevuelveQueEsUnGerente() {
		
		Empleado gerente = new Gerente("Ventas", "Aldana", 50000d, 1970, 5, 12);
		
		assertEquals("Soy un gerente", gerente.brindarDetalles());
		
	}
}
