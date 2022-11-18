package juego;

import java.util.ArrayList;

public class Bingo {
	
	public static boolean containsNumber(int[][] bingo, int nbr) {
		
		for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++) {
                if (nbr == bingo[i][j])
                	return true;
            }
        }
		
		return false;
	}
	
	public static ArrayList<Integer> callingNumber(ArrayList<Integer> numerosBingo)
	{
		int numeroGenerado;
		
		do {
			numeroGenerado = (int)(Math.random()*(75) + 1);
		}
		while(numerosBingo.contains(numeroGenerado));
		numerosBingo.add(numeroGenerado);
		
		
		return numerosBingo;
	}
	
	public static int[][] getNewArray () {
		int [][] bingo = new int[5][5];
		int c;
		for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                c = (int)(Math.random()*(75 - 1) + 1);
                while(Bingo.containsNumber(bingo, c))
                {
                	c = (int)(Math.random()*(75) + 1);
                }
                bingo[i][j] = c;
            }
        }
		bingo [2][2] = 0;
		return bingo;
	}
		
	public static void printArr(int[][] bingo) {
		for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++) {
                System.out.print(bingo[i][j] + " ");
            }
            System.out.println();
        }
	}
		
	public static boolean callBingo(int[][] bingo, ArrayList<Integer> numerosBingo) {
		int validNumbers = 0;
		for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++) 
            {
                if(numerosBingo.contains(bingo[i][j]))
                	validNumbers++;
            }
        }
		
		if (validNumbers == 24)
			return true;
		else
			return false;
	}
	
	public static int ganadorBingo() {
		ArrayList<Integer> numerosBingo = new ArrayList<>();
		
		int[][] antonio = Bingo.getNewArray();
        int[][] timotei = Bingo.getNewArray();
        int[][] pedro = Bingo.getNewArray();
        int[][] cristian = Bingo.getNewArray();
        int ganador = 0;
        
		for(int i = 0; i < 75; i++)
        {
        	numerosBingo = Bingo.callingNumber(numerosBingo);
        	if (Bingo.callBingo(antonio, numerosBingo))
            	return 1;
            if (Bingo.callBingo(timotei, numerosBingo))
            	return 2;
            if (Bingo.callBingo(pedro, numerosBingo))
            	return 3;
            if (Bingo.callBingo(cristian, numerosBingo))
            	return 4;
        }   
        return ganador;		
	}
	
	// Todo harcodeado

	public static void main(String[] args) {

        switch (Bingo.ganadorBingo()) {
        	default:
        		System.out.println("Como pierdes al bingo?");
        		break;
        	case 1:
        		System.out.println("antonio");
        		break;
        	case 2:
        		System.out.println("timotei");
        		break;
        	case 3:
        		System.out.println("pedro");
        		break;
        	case 4:
        		System.out.println("cristian");
        		break;        	
        }                	               
	}
}