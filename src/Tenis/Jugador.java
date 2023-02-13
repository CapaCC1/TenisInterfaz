package Tenis;

import java.util.Objects;

public class Jugador {
	private String nombreJugador;
	private String nombreEquipo;
	
	private int puntosGanadores;
	private int erroresNoForzados;
	private int saquesDirectos;
	
	public Jugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
		this.puntosGanadores = 0;
		this.erroresNoForzados = 0;
		this.saquesDirectos = 0;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String getNombreJugador() {
		return nombreJugador;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getPuntosGanadores() {
		return puntosGanadores;
	}

	public void setPuntosGanadores(int puntosGanadores) {
		this.puntosGanadores = puntosGanadores;
	}

	public int getErroresNoForzados() {
		return erroresNoForzados;
	}

	public void setErroresNoForzados(int erroresNoForzados) {
		this.erroresNoForzados = erroresNoForzados;
	}

	public int getSaquesDirectos() {
		return saquesDirectos;
	}

	public void setSaquesDirectos(int saquesDirectos) {
		this.saquesDirectos = saquesDirectos;
	}
	
	public void aumentarPuntosGanados() {
		puntosGanadores++;
	}
	
	public void aumentaErroresNoForzados() {
		erroresNoForzados++;
	}
	
	public void aumentarSaquesDirectos() {
		saquesDirectos++;
	}
	
	public String toString() {
		String resultado = "";
		
		resultado += "Jugador: " + nombreJugador;
		if(puntosGanadores > 0) {
			resultado += "\nPuntos GANADORES: " + puntosGanadores;
		}if(erroresNoForzados > 0) {
			resultado += "\nErrores No Forzados: " + erroresNoForzados;
		}if(saquesDirectos > 0) {
			resultado += "\nSaques Directos: " + saquesDirectos;
		}if(puntosGanadores == 0 && erroresNoForzados == 0 && saquesDirectos == 0) {
			resultado += " Sin DATOS Registrados";
		}
		return resultado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombreJugador, other.nombreJugador);
	}
	
	
}
