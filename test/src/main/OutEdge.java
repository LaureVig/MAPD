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
		super(weight);
		this.destination=destination;
		this.origin=origin;
		this.activate();
	}
	
	public boolean sameTraject (OutEdge edge) {
		return (this.origin.equals(edge.getOrigin())&&this.destination.equals(edge.getDestination()));
	}

	public Place getOrigin() {
		return origin;
	}

	public Transition getDestination() {
		return destination;
	}

}
