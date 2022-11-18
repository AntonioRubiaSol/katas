package juego;

public class Game {
	
	public static void main(String[] args) {
		
		/*this.name = name;
		this.hunger = hunger;
		this.fullness = fullness;
		this.happiness = happiness;
		this.tiredness = tiredness; */
		
		//name, happiness, tiredness, hunger, fullness
		Monster tmg = new Monster("Pikachu", 20, 20, 20, 20);
		
		tmg.timeTamagotchi();
		tmg.feedTamagotchi();
		tmg.poopTamagotchi();
		tmg.playTamagotchi();
		tmg.sleepTamagotchi();
		tmg.playTamagotchi();
		
		System.out.println(tmg.toString());
	}

}
