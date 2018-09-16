package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void cuandoBrindaDetalleDevuelveQueEsUnEmpleado() {
		
		Empleado miEmpleado = new Empleado();
		
		assertEquals("Soy un empleado", miEmpleado.brindarDetalles());
		
	}
}
