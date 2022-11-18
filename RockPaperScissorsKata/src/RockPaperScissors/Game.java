package RockPaperScissors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		boolean seguir = true;
		int respuesta;
		Scanner input = new Scanner(System.in);
		int persona;
		String[] opciones = {"papel", "piedra", "tijeras"};
		
		while(seguir) 
		{	
			System.out.println("Escoge tu movimiento: 1 para papel, 2 para roca, 3 para tijeras");
						
			do{
				persona = input.nextInt();
			}while(persona == 1 && persona == 2 && persona == 3);
			int ordenador = (int)Math.random()*(3) + 1;
						
			System.out.println("El ordenador sacó " + opciones[ordenador - 1]);
			System.out.println("El jugador sacó " + opciones[persona - 1]);
			
			if(ordenador == 1 && persona == 1) { System.out.println("Empate"); }
			if(ordenador == 1 && persona == 2) { System.out.println("Gana ordenador"); }
			if(ordenador == 1 && persona == 3) { System.out.println("Gana jugador"); }
			if(ordenador == 2 && persona == 1) { System.out.println("Gana jugador"); }
			if(ordenador == 2 && persona == 2) { System.out.println("Empate"); }
			if(ordenador == 2 && persona == 3) { System.out.println("Gana ordenador"); }
			if(ordenador == 3 && persona == 1) { System.out.println("Gana ordenador"); }
			if(ordenador == 3 && persona == 2) { System.out.println("Gana jugador"); }
			if(ordenador == 3 && persona == 3) { System.out.println("Empate"); }
		
			System.out.println("Quieres seguir? 0 para continuar");
			try{
				respuesta = input.nextInt();
				if(respuesta != 0) { seguir = false; }
			}
			catch(InputMismatchException e){
				System.out.println("Hubo un error");
				break;
			}					
		}
		System.out.println("Gracias por jugar");
	}
}
