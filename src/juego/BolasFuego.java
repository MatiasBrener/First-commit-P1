package juego;

import java.awt.Color;
import entorno.Entorno;

public class BolasFuego {
	
	private int x;
	private int y;
	private int radio;
	private int velocidad;
	private int direccion;
	
	
	public BolasFuego(int x, int y, int radio, int velocidad, int direccion) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.velocidad = velocidad;
		this.direccion = direccion;
	}
	
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getRadio() {
		return radio;
	}


	public void setRadio(int radio) {
		this.radio = radio;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public int getDireccion() {
		return direccion;
	}


	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}


	public void mover(){
		
		this.y = this.y + this.velocidad;
	}
	
	
	public void dibujar(Entorno entorno){
		
		entorno.dibujarCirculo(this.x, this.y, 2 * this.radio, Color.YELLOW);
	}
	
	
}
