package main;

public class OutEdge extends Edge{
	public Place origin;
	public Transition destination;

	@Override
	public void activate() {
		this.origin.setNumberOfTokens(this.origin.getNumberOfTokens()-this.getWeight());
		this.origin.checkActivable();
	}
	
	public void checkActivable (int nbJetons) {
		this.setActivable(nbJetons >= this.getWeight());
	}
	
	public OutEdge (Place origin, Transition destination, int id, int weight) {
		super(id,weight);
		this.destination=destination;
		this.origin=origin;
		this.activate();
	}

}
