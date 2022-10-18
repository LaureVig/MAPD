package main;

public abstract class Edge {
	private int weight;
	private boolean activable;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public abstract void activate();

	public int getWeight() {
		return weight;
	}

	public boolean isActivable() {
		return activable;
	}
	
	public void checkActivable(int nbJetons) {
	}

	public void setActivable(boolean activable) {
		this.activable = activable;
	}
	
	public Edge (int weight) {
		this.weight=weight;
		this.activable=true;
	}

}
