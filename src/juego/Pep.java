package juego;

import java.awt.Color;
import entorno.Entorno;

public class Pep {
	
	private int x;
	private int y;
	private int alto;
	private int ancho;
	private int velocidad;
	private int direccion;
	
	
	public Pep(int x, int y, int alto, int ancho, int velocidad, int direccion) {
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
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

	
	
	public void dibujar(Entorno entorno)
	{
		entorno.dibujarCirculo(this.x, this.y, this.alto, Color.white);
	}
	
	
	public void disparar() {
		
		
	}
	
	
	public void saltar() {
		
		this.y = this.y - 45;

	}

	
	public void moverDerecha(){
	
		this.x = this.x + 3;
	}
	
	public void moverIzquierda(){
	
		this.x = this.x - 3;
	}
	
	
}
