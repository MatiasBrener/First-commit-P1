package juego;

import java.awt.Color;

import entorno.Entorno;

public class Isla {
	
	private int x;
	private int y;
	private int alto;
	private int ancho;
	
	
	public Isla(int x, int y, int alto, int ancho) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
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


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	
	public void dibujar(Entorno entorno)
	{
		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.GREEN);
	}
	
	
	
	

}
