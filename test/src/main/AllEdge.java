package main;

public class AllEdge extends OutEdge{

	public AllEdge(Place origin, Transition destination, int id) {
		super(origin, destination, id, 1);
	}
	
	public void activate() {
		this.origin.setNumberOfTokens(0);
		this.origin.checkActivable();
	}

	

}
