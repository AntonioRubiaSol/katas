package snklad;

public class Game {

	public static void main(String[] args) {
		
		Player p1 = new Player("Timotei", 1);
		Player p2 = new Player("Antonio", 1);
		Board bd = new Board(p1, p2);
		String [] board = new String[100];
		board = bd.createBoard(board);
		
		System.out.println();
		bd.printBoard(board);
		System.out.println();
		
		do
		{
			p1.rollDice();
			p2.rollDice();
			if (p1.getPos() == 20 || p1.getPos() == 65 || p1.getPos() == 86 || p1.getPos() == 39)
				p1.snakeDown();
			if (p1.getPos() == 16 || p1.getPos() == 57 || p1.getPos() == 78 || p1.getPos() == 33)
				p1.ladderUp();
			if (p2.getPos() == 20 || p2.getPos() == 65 || p2.getPos() == 86 || p2.getPos() == 39)
				p2.snakeDown();
			if (p2.getPos() == 16 || p2.getPos() == 57 || p2.getPos() == 78 || p2.getPos() == 33)
				p2.ladderUp();
			System.out.println();
			bd.printBoard(board);
			System.out.println();
		}while (p1.getPos() < 100 && p2.getPos() < 100);
		
		System.out.println("\n\njuego termino");
		System.out.println("posicion "+ p1.getName() + " " +p1.getPos() + " con " + p1.getTiradas() + " tiradas");
		System.out.println("posicion "+ p2.getName() + " " +p2.getPos() + " con " + p2.getTiradas() + " tiradas");
		
		
	}

}
