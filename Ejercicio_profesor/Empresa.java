package Ejercicio_profesor;
import java.util.ArrayList;

	public class Empresa {
		private 	ArrayList <Empleado> empleados = new ArrayList <Empleado>();
		
		public void contratar (Empleado empleado) {
			empleados.add(empleado);
		}

		public double diaDePago() {
			 double sueldosTotales =  0 ;
			 for (int i=0;i<empleados.size();i++) {
				 Empleado emp = empleados.get(i);
				 sueldosTotales= sueldosTotales + emp.getSalario();
	    }
			return sueldosTotales;	
		}
		public int TotalEmpleados() {
			return empleados.size();
		}

	}



