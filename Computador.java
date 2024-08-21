package Agosto21;

public class Computador {

	String modelo;
	String cor;
	int ID;

	public String getmodelo () {
		return modelo;
	}
	
	public void setmodelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getcor () {
		return cor;
	}
	
	public void setcor (String cor) {
		this.cor = cor;
	}
	
	public int getID () {
		return ID;
	}
	
	public void setID (int ID) {
		this.ID = ID;
	}
	
	public String ligar () {
		return "ligar";
	}
	
	public String processar () {
		return "processar";
	}	
	
	public String reiniciar () {
		return "reiniciar";
	}

	public String desligar () {
		return "desligar";
	}
}