package main;

public class ZeroEdge extends OutEdge{
	public ZeroEdge(Place origin, Transition destination, int id, int weight) {
		super(origin, destination, id, weight);
	}

	public void activate() {}
	
	public void checkActivable(int nbJetons) {
		this.setActivable(nbJetons==0);
	}

}
