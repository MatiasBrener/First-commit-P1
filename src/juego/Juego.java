package juego;


import java.awt.Color;
import java.util.Random;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	private Gnomo [] gnomo;
	private Tortuga [] tortuga;
	private Pep pep;
	private BolasFuego bolasFuego;
	private Isla [] isla;
	
	
	
	
	
	
	Juego(){
		
	//	Random rand = new Random();
		
		// Inicializa el objeto entorno
		
		this.entorno = new Entorno(this, "Proyecto para TP", 800, 600);
		
		
		// Inicializar lo que haga falta para el juego
		this.gnomo = new Gnomo[10];
		this.tortuga = new Tortuga[7];
		this.pep = new Pep(350, 465, 25, 10, 2, 1);
		this.bolasFuego = new BolasFuego(1,1,3,2, 1);
	//	this.isla = new Isla(350, 500, 35, 130);
		
		this.isla = new Isla[15];
		
		int origenIsla = 100;
		int alturaIsla = 500;
		for (int i = 0; i < this.isla.length; i++) {
		    this.isla[i] = new Isla(origenIsla, alturaIsla, 35, 130);
		    origenIsla += 200; // Aumenta la distancia entre islas
		    
		    
//		    if(i > 5) {
//		    	alturaIsla = 400;
//		    	this.isla[i] = new Isla(origenIsla, alturaIsla, 35, 130);
//		    	origenIsla += 200; // Aumenta la distancia entre islas
//		    }+
		    
		}

//		origenIsla = 200;
//		for (int i = 0; i < this.isla.length; i++) {
//		    this.isla[i] = new Isla(origenIsla, 350, 35, 130);
//		    origenIsla += 200; // Aumenta la distancia entre islas
//		}
//		
		
		
		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo

		if(this.entorno.estaPresionada(this.entorno.TECLA_DERECHA) &&
				this.pep.getX() + this.pep.getAncho()/2 <
				this.entorno.ancho())
			this.pep.moverDerecha();
		
		if(this.entorno.estaPresionada(this.entorno.TECLA_IZQUIERDA) &&
				this.pep.getX() - this.pep.getAncho()/2 > 0)
			
			this.pep.moverIzquierda();
				
		
		
		for(int i = 0; i < this.isla.length; i++) {
			this.isla[i].dibujar(this.entorno);			}
		
		this.pep.dibujar(this.entorno);
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
