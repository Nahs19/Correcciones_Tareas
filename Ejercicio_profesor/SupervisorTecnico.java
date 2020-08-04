package Ejercicio_profesor;

public class SupervisorTecnico extends Empleado {
	
	private int aniosTrabajo;

	public SupervisorTecnico(String identificacion, double salario, int aniosTrabajo) {
		super(identificacion, salario);
		this.aniosTrabajo=aniosTrabajo;
	
	}
	
	public int getAniosTrabajo() {
		return aniosTrabajo;
	}

	public void setAniosTrabajo(int aniosTrabajo) {
		this.aniosTrabajo = aniosTrabajo;
	}

	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for (int i=0; i < aniosTrabajo; i++){
			aumento += salario*0.05;	
		}
		return salario+aumento;
	}

	

}
