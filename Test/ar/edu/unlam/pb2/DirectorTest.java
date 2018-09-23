package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirectorTest {
	@Test
	public void cuandoBrindaDetalleDevuelveQueEsUnDirector() {
		
		Empleado director = new Director("Exactas", "Paola", 30000d, 1950, 9, 23, 10000d);
		
		assertEquals("Soy un director", director.brindarDetalles());
		
	}


}
