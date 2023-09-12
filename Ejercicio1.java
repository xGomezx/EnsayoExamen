package simulacroExamen;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public void iniciar() {
		
		pedirDatos();
		JOptionPane.showMessageDialog(null, "Fin del ejercicio 1");
	}
	
	String nombres[],profesiones[];
	int documentos[],edades[];
	
	public void pedirDatos() {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que desea ingresar"));
		
		nombres = new String[cantidad];
		profesiones = new String[cantidad];
		
		documentos = new int[cantidad];
		edades = new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			
			nombres[i] = JOptionPane.showInputDialog("Ingresa el nombre la persona "+ (i+1));
			documentos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el documento la persona "+(i+1)));
			edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona "+(i+1)));
			profesiones[i] = JOptionPane.showInputDialog("Ingresa la profesion de la persona "+(i+1));
		}
		
		String datos = "<<<<<<<<<<<<< Registro Exitoso >>>>>>>>>>>>>\n\n";
		for (int i = 0; i < cantidad; i++) {
			datos += (i+1)+") " + nombres[i]+", "+documentos[i]+", "+edades[i]+", "+profesiones[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, datos);
		imprimirInfo();
	}
	
	public void imprimirInfo() {
		
		int cantidadPersonas,mayoresEdad=0,menoresEdad=0;
		
		cantidadPersonas = nombres.length;
		
		for (int i = 0; i < edades.length; i++) {
			
			if (edades[i] >= 18) {
				mayoresEdad ++;
			} else {
				menoresEdad++;
			}
		}
		
		String info = "<<<<<<<<<<<<<< Informacion Personas >>>>>>>>>>>>>>\n\n";
		info += "Total personas Registradas = "+cantidadPersonas+"\n";
		info += "Total mayores de edad = "+mayoresEdad+"\n";
		info += "Total menores de edad = "+menoresEdad+"\n";
				
		JOptionPane.showMessageDialog(null, info);
		
	}
	
}
