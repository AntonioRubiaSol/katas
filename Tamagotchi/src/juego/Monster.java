package juego;

public class Monster {

	private String name;
	private int hunger;
	private int fullness;
	private int happiness;
	private int tiredness;
	
	public Monster(String name, int happiness, int tiredness, int hunger, int fullness) {
		super();
		this.name = name;
		this.happiness = happiness;
		this.tiredness = tiredness;
		this.hunger = hunger;
		this.fullness = fullness;
	}
	
	@Override
	public String toString() {
		return "Monster [name=" + name + ", hunger=" + hunger + ", fullness=" + fullness + ", happiness=" + happiness
				+ ", tiredness=" + tiredness + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getFullness() {
		return fullness;
	}

	public void setFullness(int fullness) {
		this.fullness = fullness;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getTiredness() {
		return tiredness;
	}

	public void setTiredness(int tiredness) {
		this.tiredness = tiredness;
	}

	public void feedTamagotchi() {
		System.out.println("Feeding " + name);
		System.out.println("+20 fullness -20 hunger");
		this.setFullness(getFullness() + 20);
		this.setHunger(getHunger() - 20);
		
	}
	
	public void playTamagotchi() {
		System.out.println("Playing with " + name);
		System.out.println("+25 happiness +15 tiredness");
		this.setHappiness(getHappiness() + 25);
		this.setTiredness(getTiredness() + 15);
	}

	public void sleepTamagotchi() {
		System.out.println("Putting " + name + " to sleep");
		System.out.println("-25 tiredness");
		this.setTiredness(getTiredness() - 25);
	}

	public void poopTamagotchi() {
		System.out.println(name + " is pooping");
		System.out.println("-15 fullness");
		this.setFullness(getFullness() - 15);
	
	}

	public void timeTamagotchi() {
		System.out.println(name + " is hungry, tired and sad, it needs your care :(");
		System.out.println("+20 hungriness +20 tiredness -20 happiness");
		this.setFullness(getTiredness() + 20);
		this.setHunger(getHunger() + 20);
		this.setHappiness(getHappiness() - 15);
	
	}
	
	
}
