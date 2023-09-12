package simulacroExamen;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public void iniciar() {
		pedirNumeros();
		sumar();
		JOptionPane.showMessageDialog(null, "Fin del ejercicio 2");
	}
	
	int lista1[],lista2[],suma[];
	
	
	public void pedirNumeros() {
		int cantidad;
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea ingresar"));
		
		lista1=new int[cantidad];
		lista2=new int[cantidad]; 
		suma =new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
		 lista1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" de la primera lista"));
		 lista2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" de la segunda lista"));
		}
		
	}
	
	public void sumar() {
		
		
		for (int i = 0; i < lista1.length; i++) {
			suma[i]= lista1[i]+lista2[i];
		}
		imprimirArrays();
		
	}
	public void imprimirArrays() {
		
		String mensaje = "<<<<<<<<<<<<<< Resultados >>>>>>>>>>>>>>\n\n";
		
		mensaje+= "Lista 1 = ";
		for (int i = 0; i < lista1.length; i++) {
			mensaje += lista1[i]+", ";
		}
		mensaje+="\n";
		mensaje+= "Lista 2 = ";
		for (int i = 0; i < lista2.length; i++) {
			mensaje += lista2[i]+", ";
		}
		mensaje+="\n";
		mensaje+= "Sumas = ";
		for (int i = 0; i < suma.length; i++) {
			mensaje += suma[i]+", ";
		}
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
	
}
