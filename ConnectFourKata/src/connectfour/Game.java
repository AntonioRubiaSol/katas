package connectfour;

import java.util.Arrays;
import java.util.Scanner;

/* Bugged, sometimes computer wins earlier */
public class Game {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] tablero = new int[7][7];
		
		int jugador = 1;
		int ordenador = 2;
		
		while(true) 
		{
			Game.mostarTablero(tablero);
			System.out.println("Escoje una columna del 0 al 6");
			int posicion = input.nextInt();
			Game.colocarPieza(posicion, tablero, jugador);
			if(Game.comprobarGanador(jugador, tablero)) 
			{
				System.out.println("Ganaste");
				break;				
			} 
			int posicionOrdenador = (int) (Math.random() * 7);
			Game.colocarPieza(posicionOrdenador, tablero, ordenador);
			if(Game.comprobarGanador(ordenador, tablero))
			{
				System.out.println("Ganó el ordenador");
				break;
			}	 	
		}	System.out.println("win"); 


	}
	
	public static boolean colocarPieza(int columna, int[][] tablero, int jugador) 
	{
		for (int i = 6; i >= 0; i--)
        {
            if(tablero[i][columna] == 0) 
            { 
            	tablero[i][columna] = jugador;
            	return true;
            }
        }
		System.out.println("Esa columna está completa");
		return false;
	}
	
	public static void mostarTablero(int[][] tablero) 
	{
		for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }	
		System.out.println("------------------------------------------------");
	}
	
	public static boolean comprobarGanador(int jugador, int[][] tablero) 
	{	
		if(Game.comprobarDiagonalDerecha(jugador, tablero) || Game.comprobarHorizontal(jugador, tablero) || Game.comprobarVertical(jugador, tablero) || Game.comprobarDiagonalIzquierda(jugador, tablero))  
		{
			return true;
		}		
		return false;
	}		

	public static boolean comprobarVertical(int jugador, int[][] tablero)
	{
		int contador = 1;
		int previous = tablero[0][0];
		int current = 0;
		for (int i = 0; i < 7 ; i++)
        {
			for (int j = 0; j < 7; j++)
			{
				current = tablero[j][i];
				if ( current == previous && current == jugador ) { contador++; }
				else { contador = 1; }
				previous = current;
				if ( contador == 4 ) 
				{ 
					Game.mostarTablero(tablero);
					return true; 
				}
			}
        }
       
		return false;
	}
	
	public static boolean comprobarHorizontal(int jugador, int[][] tablero)
	{
		int contador = 1;
		int previous = tablero[0][0];
		int current = 0;
		for (int i = 0; i < 7 ; i++)
        {
			for (int j = 0; j < 7; j++)
			{
				current = tablero[i][j];
				if ( current == previous && current == jugador ) { contador++; }
				else { contador = 1; }
				previous = current;
				if ( contador == 4 ) 
				{ 
					Game.mostarTablero(tablero);
					return true; 
				}
			}
        }
       
		return false;
	}
	
	public static boolean comprobarDiagonalDerecha(int jugador, int[][] tablero)
	{
		int contador = 0;
		int previous = tablero[0][0];
		int current = 0;
		for (int i = 0; i < 7 ; i++)
        {
			for (int j = 0; j < 7; j++)
			{
				if( j + 1 < 6 ) { current = tablero[j+1][i]; }
				if ( current == previous && current == jugador ) { contador++; }
				else { contador = 0; }
				previous = current;
				if ( contador == 4 ) 
				{ 
					Game.mostarTablero(tablero);
					return true; 
				}
			}
        }
       
		return false;
	}
	
	public static boolean comprobarDiagonalIzquierda(int jugador, int[][] tablero)
	{
		int contador = 1;
		int previous = tablero[0][0];
		int current = 0;
		for (int i = 0; i < 7 ; i++)
        {
			for (int j = 0; j < 7; j++)
			{
				if( i + 1 < 7 && j + 1 < 7 ) { current = tablero[i+1][j+1]; }
				if ( current == previous && current == jugador ) { contador++; }
				else { contador = 1; }
				previous = current;
				if ( contador == 4 ) 
				{ 
					Game.mostarTablero(tablero);
					return true; 
				}
			}
        }
		return false;
	}
}
