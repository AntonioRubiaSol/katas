package snklad;

public class Player {
	
	private String name;
	private int pos;
	private int tiradas = 0;
	
	public Player(String name, int pos) {
		super();
		this.name = name;
		this.pos = pos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public void rollDice() {
		tiradas++;
		int nbr = (int) (Math.random()*6 + 1);
		
		if ((nbr + pos) > 100)
			System.out.println("Not moving "+name);
		else
			pos += nbr;
		
	}
	
	public int getTiradas() {
		return tiradas;
	}
	public void setTiradas(int tiradas) {
		this.tiradas = tiradas;
	}
	public void snakeDown()
	{
		System.out.println("Snake DOWN 15 slots " + name);
		pos -= 15;
	}
	
	public void ladderUp()
	{
		System.out.println("Ladder UP 15 slots " + name);
		pos += 15;
		
	}
	
	
}
