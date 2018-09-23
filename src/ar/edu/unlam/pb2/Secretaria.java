package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Secretaria extends Empleado {

	@Override
	public String brindarDetalles() {
		return "Soy una secretaria";
	}

	public Secretaria(String nombre, Double salario, Integer anio, Integer mes, Integer dia) {
		super(nombre, salario, anio, mes, dia);

		this.fechaDeNacimiento = LocalDate.of(anio, mes, dia);
		this.nombre = nombre;
		this.salario = salario;
	}
}
