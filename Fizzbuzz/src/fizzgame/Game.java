package fizzgame;

public class Game {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++)
		{
			if (Game.fizzing(i) == "")
				System.out.println(i);
			else
				System.out.println(Game.fizzing(i));
		}
	}

	public static String fizzing (int nbr) 
	{
		String response = "";
		if (nbr % 3 == 0)
			response += "fuzz ";
		if (nbr % 5 == 0)
			response += "buzz ";
		if (nbr % 7 == 0)
			response += "pop";
		
		
		return response;
	}
}
