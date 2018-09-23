package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Empleado {
	
	protected String nombre;
	protected Double salario;
	protected LocalDate fechaDeNacimiento;
	
	
	public Empleado(String nombre, Double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public Empleado(String nombre, Double salario, Integer anio ,Integer mes, Integer dia) {
		this.fechaDeNacimiento = LocalDate.of(anio, mes, dia) ;
		this.nombre = nombre;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String brindarDetalles() {
		return "Soy un empleado";
	}

}
