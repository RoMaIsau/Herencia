package ar.edu.unlam.pb2;

public class Gerente extends Empleado {
	
	protected String departamento;
	protected Double horasExtra;
   
   
	public Gerente( String departamento ,String nombre, Double salario, Integer anio ,Integer mes, Integer dia) {
		super(nombre, salario, anio, mes, dia);
		
		this.departamento = departamento;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Double getHorasExtra() {
		return horasExtra;
	}


	public void setHorasExtra(Double horasExtra) {
		this.horasExtra = horasExtra;
	}

	@Override
	public String brindarDetalles() {
		return "Soy un gerente";
	}
}

