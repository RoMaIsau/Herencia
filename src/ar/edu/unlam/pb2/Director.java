package ar.edu.unlam.pb2;

public class Director extends Gerente {
	private Double salarioExtra;

	public Director(String departamento, String nombre, Double salario, Integer anio, Integer mes, Integer dia, Double salarioExtra) {
		super(departamento, nombre, salario, anio, mes, dia);
		this.salarioExtra = salarioExtra;
	}

	@Override
	public String brindarDetalles() {
		return "Soy un director";
	}

	public Double getSalarioExtra() {
		return salarioExtra;
	}

	public void setSalarioExtra(Double salarioExtra) {
		this.salarioExtra = salarioExtra;
	}

}
