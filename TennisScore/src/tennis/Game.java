package tennis;

import java.util.Scanner;

public class Game {
	
	private static String[] scores = {"0","15", "30", "40", "A", "WIN!!"};
	
	public static void main(String[] args) {
		
		boolean winner = false;
		boolean turnPlayer1 = true;
		
		Score player1 = new Score ("JORGE", 0);
		Score player2 = new Score ("IA", 0);
		
		System.out.println(printScore(player1, player2));
		
		Scanner sc = new Scanner(System.in);
		int recibir = 0, disparar = 0;
		
		while (!winner)
		{
			if (turnPlayer1)
			{
				System.out.println("Turno "+ player1.getName() + "\n");
				System.out.println("Realizas el tiro a la izquierda (1), al centro(2) o hacia la derecha(3)?\n");
				disparar = sc.nextInt();/*  esperar un tiempo
				try {
					Game.sleeping();
				} catch (InterruptedException e) {
					System.out.println("\n\n       ERROR    \n\n");
				}*/
				recibir = (int) Math.random()*3 + 1;
				//System.out.println(recibir); aviso disparo ia
				if (recibir != disparar)
				{
					player1.winPoint();
					System.out.println("\nPlayer 1 ++ punto!!\n");
				}
					
				if ((player1.getPoints() == 5 && player2.getPoints() == 3) || (player1.getPoints() == 3 && player2.getPoints() < 3))
					winner = true;
				if ((player2.getPoints() == 5 && player1.getPoints() == 3) || (player2.getPoints() == 3 && player1.getPoints() < 3))
					winner = true;
				
			}
			else
			{
				System.out.println("Turno " + player2.getName() + "\n");
				disparar = (int) (Math.random()*3 + 1);
				//System.out.println(disparar); aviso disparo ia
				System.out.print(player1.getName() + " recibes el tiro a la izquierda (1), al centro(2) o hacia la derecha(3)?\1");
				recibir = sc.nextInt();/*  esperar un tiempo
				try {
					Game.sleeping();
				} catch (InterruptedException e) {
					System.out.println("\n\n       ERROR    \n\n");
				}*/
				if (recibir != disparar)
				{
					player2.winPoint();
					System.out.println("\nPlayer 2 ++ punto!!\n");
				}
				if ((player1.getPoints() == 5 && player2.getPoints() == 3) || (player1.getPoints() == 3 && player2.getPoints() < 3))
					winner = true;
				if ((player2.getPoints() == 5 && player1.getPoints() == 3) || (player2.getPoints() == 3 && player1.getPoints() < 3))
					winner = true;
			}
			
			if (turnPlayer1)
				turnPlayer1 = false;
			else
				turnPlayer1 = true;
			System.out.println(printScore(player1, player2));
		}
		
		System.out.println("\nSE ACABO LA PARTIDA\n");
		if (player1.getPoints() > player2.getPoints())
			System.out.println("\nGANA EL JUGADOR 1\n");
		if (player2.getPoints() > player1.getPoints())
			System.out.println("\nGANA EL JUGADOR 2\n");
		
		sc.close();
		
		
		
		
	}
	
	public static void sleeping() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	
	public static String printScore(Score player1, Score player2)
	{
		String respuesta = "";
		if (player1.getPoints() == 4 && player2.getPoints() == 4)
		{
			player1.losePoint();
			player2.losePoint();
		}
		respuesta = "\n" +scores[player1.getPoints()] +" : " + scores[player2.getPoints()] + "\n";
		
		return respuesta;
		
	}

}


/*  jugar 1vs1
while (!winner)
{
	if (turnPlayer1)
	{
		System.out.println("Turno "+ player1.getName() + "\n");
		System.out.println("Realizas el tiro a la izquierda (1), al centro(2) o hacia la derecha(3)?\n");
		disparar = sc.nextInt();
		System.out.print(player2.getName() + " recibes el tiro a la izquierda (1), al centro(2) o hacia la derecha(3)?\n");
		recibir = sc.nextInt();
		if (recibir != disparar)
			player1.winPoint();
		
		if (player1.getPoints() == 5 && player2.getPoints() == 3)
			winner = true;
		if (player2.getPoints() == 5 && player1.getPoints() == 3)
			winner = true;
		System.out.println(printScore(player1, player2));
	}
	else
	{
		System.out.println("Turno " + player2.getName() + "n");
		System.out.println("Realizas el tiro a la izquierda (1), al centro(2) o hacia la derecha(3)?\n");
		disparar = sc.nextInt();
		System.out.print(player1.getName() + " recibes el tiro a la izquierda (1), al centro(2) o hacia la derecha(3)?\n");
		recibir = sc.nextInt();
		if (recibir != disparar)
			player2.winPoint();
		
		if (player1.getPoints() == 5 && player2.getPoints() == 3)
			winner = true;
		if (player2.getPoints() == 5 && player1.getPoints() == 3)
			winner = true;
		System.out.println(printScore(player1, player2));
	}
	
	if (turnPlayer1)
		turnPlayer1 = false;
	else
		turnPlayer1 = true;
}*/