package simulacroExamen;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public void iniciar() {
		
		pedirDatos();
		JOptionPane.showMessageDialog(null, "Fin del ejercicio 1");
	}
	
	ArrayList<String> nombres=new ArrayList<>();
	ArrayList<String> profesiones=new ArrayList<>();
	
	ArrayList <Integer> documentos=new ArrayList<>();
	ArrayList<Integer> edades=new ArrayList<>();
	//String nombres[],profesiones[];
	//int documentos[],edades[];
	
	public void pedirDatos() {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que desea ingresar"));
		
		//nombres = new String[cantidad];
		//profesiones = new String[cantidad];
		
		//documentos = new int[cantidad];
		//edades = new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			
			nombres.add(i,JOptionPane.showInputDialog("Ingresa el nombre la persona "+ (i+1)));
			documentos.add(i, Integer.parseInt(JOptionPane.showInputDialog("Ingresa el documento la persona "+(i+1))));
			edades.add(i, Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona "+(i+1))));
			profesiones.add(i, JOptionPane.showInputDialog("Ingresa la profesion de la persona "+(i+1)));
		}
		
		String datos = "<<<<<<<<<<<<< Registro Exitoso >>>>>>>>>>>>>\n\n";
		for (int i = 0; i < nombres.size(); i++) {
			datos += (i+1)+") " + nombres.get(i)+", "+documentos.get(i)+", "+edades.get(i)+", "+profesiones.get(i)+"\n";
		}
		JOptionPane.showMessageDialog(null, datos);
		imprimirInfo();
	}
	
	public void imprimirInfo() {
		
		int cantidadPersonas,mayoresEdad=0,menoresEdad=0;
		
		cantidadPersonas = nombres.size();
		
		for (int i = 0; i < edades.size(); i++) {
			
			if (edades.get(i) >= 18) {
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
