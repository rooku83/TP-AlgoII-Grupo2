package tp.framework.juego;

import tp.framework.elementos.Ficha;
import tp.framework.elementos.Jugador;

public abstract class Juego {
	protected Ficha tablero[][] = null;
	private String nombre = null;
	protected int filas;
	protected int columnas;
	
	public abstract void inicializar();	
	

	public void setFilas(int f)	{
	filas = f;	
	}
	
	public void setColumnas(int c)	{
	columnas = c;	
	}
	
	public int getFilas()	{
	return filas;	
	}
	
	public int getColumnas()	{
	return columnas;	
	}
	
	public void armarTablero(int x, int y) {
		tablero = new Ficha[x][y];
	}
	
	public void setTablero(Ficha[][] t) {
		tablero = t;
	}

	public Ficha[][] getTablero() {
		return tablero;
	}

	public abstract void mostrarTablero();

	public void setNombre(String n) {
		nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	private Jugador jugador1 = null;
	private Jugador jugador2 = null;
	
	public void setJugadores(Jugador j1, Jugador j2) {
		jugador1 = j1;
		jugador2 = j2;
	}

	public abstract boolean validarMovimiento(Ficha ficha, int x, int y);
	
	public void posicionar(Ficha ficha, int x, int y) {
		ficha.mover(x, y);
		tablero[x][y] = ficha;
	}
	
	public abstract boolean estaTerminado(Jugador jugador);
	
	public abstract boolean estaEmpatado(int contador);


}
