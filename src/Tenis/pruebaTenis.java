package Tenis;

import java.util.Scanner;

public class pruebaTenis {
	
	public static String codigoResultado(int codigo) {
	    switch (codigo) {
	        case 0:
	            return "Jugador NO Encontrado";
	        case 1:
	            return "**Punto GANADOR Agregado!**";
	        case 2:
	        	return "**Error No Forzado Agregado!**";
	        case 3:
	        	return "**Saque Directo Agregado!**";
	        default:
	            return "Codigo desconocido";
	    }
	}
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		
		System.out.println("*FINAL RONALD GARROS*");
		/*
		System.out.println("");
		System.out.println("Introduzca el NOMBRE del PRIMER EQUIPO");
		String primerEquipo = in1.next();
		System.out.print("Jugador 1: ");
		in1.nextLine();
		String jugadorN1 = in1.nextLine();
		
		System.out.print("Jugador 2: ");
		String jugadorN2 = in1.nextLine();
		
		
		System.out.println("");
		System.out.println("Introduzca el NOMBRE del SEGUNDO EQUIPO");
		String segundoEquipo = in1.next();
		System.out.print("Jugador 1: ");
		in1.nextLine();
		String jugadorN3 = in1.nextLine();
		System.out.print("Jugador 2: ");
		String jugadorN4 = in1.nextLine();
		
		*/
		
		String primerEquipo = "SPAIN";
		String jugadorN1 = "Nadal";
		String jugadorN2 = "Alcaraz";
		
		String segundoEquipo = "USA";
		String jugadorN3 = "John";
		String jugadorN4 = "Williams";
		
		Partido partido1 = new Partido();
		partido1.agregarEquipo(primerEquipo, jugadorN1, jugadorN2);
		partido1.agregarEquipo(segundoEquipo, jugadorN3, jugadorN4);
		
		while(!salir) {
			System.out.println("");
			System.out.println("ESTADISTICAS");
			System.out.println("1. Contabiliza Punto Ganador");
			System.out.println("2. Contabiliza Error No Forzado");
			System.out.println("3. Contabiliza Saque Directo");
			System.out.println("4. Muestra Estadisticas de Jugador");
			System.out.println("5. Muestra Estadisticas de Equipo");
			int seleccion = in1.nextInt();
			switch(seleccion) {
			case 1:
				System.out.println("");
				System.out.println("*CONTABILIZA PUNTO GANADOR*");
				System.out.println("");
				System.out.println("Introduzca Nombre del JUGADOR");
				in1.nextLine();
				String nombre = in1.nextLine();
				int resultado = partido1.agregaPuntoGanador(nombre);
				System.out.println(codigoResultado(resultado));
				break;
			case 2:
				System.out.println("");
				System.out.println("CONTABILIZA ERROR NO FORZADO");
				System.out.println("");
				System.out.println("Introduzca Nombre del JUGADOR");
				in1.nextLine();
				nombre = in1.nextLine();
				resultado = partido1.agregaErrorNoForzado(nombre);
				System.out.println(codigoResultado(resultado));
				break;
			case 3:
				System.out.println("");
				System.out.println("CONTABILIZA SAQUE DIRECTO");
				System.out.println("");
				System.out.println("Introduzca Nombre del JUGADOR");
				in1.nextLine();
				nombre = in1.nextLine();
				resultado = partido1.agregaErrorNoForzado(nombre);
				System.out.println(codigoResultado(resultado));
				break;
			case 4:
				System.out.println("");
				System.out.println("MUESTRA ESTADISTICAS DE JUGADOR");
				System.out.println("");
				System.out.println("Introduzca el Nombre del JUGADOR: ");
				in1.nextLine();
				nombre = in1.nextLine();
				System.out.println(partido1.muestraEstadisticasJugador(nombre));
				
				break;
			case 5:
				System.out.println("");
				System.out.println("MUESTRA ESTADISTICAS DE EQUIPO");
				System.out.println("");
				System.out.println("Introduzca el Nombre del EQUIPO");
				in1.nextLine();
				String equipo = in1.nextLine();
				System.out.println(partido1.muestraEstadisticasEquipo(equipo));
			    
				break;
			}
		}
		in1.close();
	}

	
}