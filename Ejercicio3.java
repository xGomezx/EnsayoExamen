package simulacroExamen;

import javax.swing.JOptionPane;

public class Ejercicio3 {

		public void iniciar() {
			
			pedirDatos();
		}
		
		String nombre[];
		int estrato[];
		double sueldo[];
		
		public void pedirDatos() {
			
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
			nombre=new String[cantidad];
			estrato=new int[cantidad];
			sueldo=new double[cantidad];
			
			for (int i = 0; i < cantidad; i++) {
				
				nombre[i]=JOptionPane.showInputDialog("Ingresa el nombre del empleado "+(i+1));
				estrato[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nombre del empleado "+(i+1)));
				sueldo[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el nombre del empleado "+(i+1)));
			}
		}
}
