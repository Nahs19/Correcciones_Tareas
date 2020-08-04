package Ejercicio_profesor;

public class Gerente extends SupervisorTecnico {
	
	private double viaticos;
	
	public Gerente(String identificacion, double salario, int anhosTrabajados, double viaticos) {
		super(identificacion, salario, anhosTrabajados);
		this.viaticos = viaticos;
	}
	
	public double getSalario() {
		return super.getSalario() + viaticos;
	}

}