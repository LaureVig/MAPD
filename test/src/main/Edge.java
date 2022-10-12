package main;

public abstract class Edge {
	private int weight;
	private boolean activable;
	private int id;
	
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
	
	public Edge (int id, int weight) {
		this.id=id;
		this.weight=weight;
		this.activable=true;
	}

}
