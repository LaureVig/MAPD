package main;

public class Transition {
	private int id;
	private boolean activable;
	
	/**
	 * Constructor of Transition
	 * @param id
	 * @param activable
	 */
	public Transition(int id, boolean activable) {
		this.id = id;
		this.activable = activable;
	}
	
	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActivable() {
		return activable;
	}
	public void setActivable(boolean activable) {
		this.activable = activable;
	}
	
	// Methods
	public void doTransition() {
		
	}
}
