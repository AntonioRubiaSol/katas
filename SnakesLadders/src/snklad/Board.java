package snklad;

public class Board {
	
	private Player p1;
	private Player p2;
	
	public Board(Player p1, Player p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public String[] createBoard(String[] board)
	{	
		for (int i = 0; i < 100; i++)
			board[i] = "-";
		return board;
	}
	
	public void printBoard(String[] board)
	{
		for (int i = 0; i < 100; i++)
		{
			if(p1.getPos() == i)
				System.out.print("\\");
			if(p2.getPos() == i)
				System.out.print("/");
			
			System.out.print(board[i]);
				
		}
	}
	
	
}
