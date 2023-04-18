package Modelos;

public class Tablero {

	private Cordenada PosicionActualTopo;
	private Cordenada PosicionAnteriorTopo;
	private int puntos;
	
	public Tablero() {
		puntos = 0;

		PosicionActualTopo = new Modelos.Cordenada(-1,  -1);
		PosicionAnteriorTopo = new Modelos.Cordenada(-1,  -1);
	}
	
	
	public Cordenada getPosicionAnteriorTopo() {
		return PosicionAnteriorTopo;
	}

	public void setPosicionAnteriorTopo(Cordenada posicionAnteriorTopo) {
		PosicionAnteriorTopo = posicionAnteriorTopo;
	}

	public Cordenada getPosicionActualTopo() {
		return PosicionActualTopo;
	}

	public void setPosicionActualTopo(Cordenada posicionNueva) {
		
		PosicionAnteriorTopo = PosicionActualTopo;
		
		PosicionActualTopo = posicionNueva;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	
	
	

	public void aumentarPuntos() {
		puntos = puntos + 1;
	}
	
	
	
}
