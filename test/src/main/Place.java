package main;

public class Place {
	private int id;
	private int numberOfTokens;
	
	/**
	 * Constructor of Place
	 * @param id
	 * @param numberOfTokens
	 */
	public Place(int id, int numberOfTokens) {
		this.id = id;
		this.numberOfTokens = numberOfTokens;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfTokens() {
		return numberOfTokens;
	}
	public void setNumberOfTokens(int numberOfTokens) {
		this.numberOfTokens = numberOfTokens;
	}
	
	public boolean checkActivable() {
		
		return true;
	}
}
