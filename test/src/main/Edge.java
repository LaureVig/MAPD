package main;

public abstract class Edge {
	private int weight;
	private boolean activable;
	private int id;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public abstract void activer();

	public int getWeight() {
		return weight;
	}

	public boolean isActivable() {
		return activable;
	}
	
	public void checkActivable(int nbJetons) {
	}

}
