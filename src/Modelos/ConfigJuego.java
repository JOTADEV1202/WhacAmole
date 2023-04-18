package Modelos;

public class ConfigJuego {

	private int cantidadJugadores;
	private String nombreJugador1;
	private String nombreJugador2;
	private Modelos.Dificultad dificultad;
	
	
	
	public Modelos.Dificultad getDificultad() {
		return dificultad;
	}
	public void setDificultad(Modelos.Dificultad dificultad) {
		this.dificultad = dificultad;
	}
	public String getNombreJugador2() {
		return nombreJugador2;
	}
	public void setNombreJugador2(String nombreJugador2) {
		this.nombreJugador2 = nombreJugador2;
	}
	public String getNombreJugador1() {
		return nombreJugador1;
	}
	public void setNombreJugador1(String nombreJugador1) {
		this.nombreJugador1 = nombreJugador1;
	}
	public int getCantidadJugadores() {
		return cantidadJugadores;
	}
	public void setCantidadJugadores(int cantidadJugadores) {
		this.cantidadJugadores = cantidadJugadores;
	}
	
}
