package ar.edu.unlam.pb2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GerenteTest {
	
	@Test
	public void unGerenteEsUnEmpleado() {
		
		Gerente miGerente = new Gerente();
		
		assertTrue(miGerente instanceof Empleado);
	}
	
	
}
