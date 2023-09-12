package simulacroExamen;

import javax.swing.JOptionPane;

public class Ejercicio3 {

		public void iniciar() {
			
			pedirDatos();
		}
		
		String nombre[];
		int estrato[];
		double sueldoActual[],descuentos[],sueldoFinal[];
		
		public void pedirDatos() {
			
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
			nombre=new String[cantidad];
			estrato=new int[cantidad];
			sueldoActual=new double[cantidad];
			
			for (int i = 0; i < cantidad; i++) {
				
				nombre[i]=JOptionPane.showInputDialog("Ingresa el nombre del empleado "+(i+1));
				estrato[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el estrato del empleado "+(i+1)));
				sueldoActual[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el sueldo actual del empleado "+(i+1)));
			}
			
			descuentos();
		}
		
		public void descuentos() {
			
			descuentos = new double[estrato.length];
			sueldoFinal = new double[estrato.length];
			
			for (int i = 0; i < estrato.length; i++) {
				
				if (estrato[i]>=1 && estrato[i]<=2) {
					
					descuentos[i] = sueldoActual[i]*0.02;
					sueldoFinal[i] = sueldoActual[i]-(sueldoActual[i]*0.02);
				}
				else if(estrato[i]>=3 && estrato[i]<=4) {
					
					descuentos[i] = sueldoActual[i]*0.04;
					sueldoFinal[i] = sueldoActual[i]-(sueldoActual[i]*0.04);
				}
				else if(estrato[i] == 5) {
					
					descuentos[i] = sueldoActual[i]*0.08;
					sueldoFinal[i] = sueldoActual[i]-(sueldoActual[i]*0.08);
				}
				else if(estrato[i] == 6) {
					descuentos[i] = sueldoActual[i]*0.1;
					sueldoFinal[i] = sueldoActual[i]-(sueldoActual[i]*0.1);
				}
			}
			
			imprimirDatos();
			
		}
		
		public void imprimirDatos() {
			
			String datos = "<<<<<<<<<<<<<<<<<<< Datos Finales >>>>>>>>>>>>>>>>>>>\n\n";
			
			for (int i = 0; i < descuentos.length; i++) {
				datos += "Nombre = "+nombre[i]+"\n"+"Estrato = "+estrato[i]+"\n"+"Sueldo Normal = "+sueldoActual[i]+"\n"+"Descuento realizado = "+descuentos[i]+"\n"+"Sueldo Final = "+sueldoFinal[i]+"\n\n" ;
			}
			
			JOptionPane.showMessageDialog(null, datos);
		}
}
