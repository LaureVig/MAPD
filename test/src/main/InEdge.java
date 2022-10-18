package main;

public class InEdge extends Edge{
	

	private Transition origin;
	private Place destination;

	@Override
	public void activate() {
		this.destination.setNumberOfTokens(this.destination.getNumberOfTokens()+this.getWeight());
		this.destination.checkActivable();
	}
	
	public Transition getOrigin() {
		return origin;
	}

	public Place getDestination() {
		return destination;
	}

	public InEdge(Transition origin, Place destination,int id, int weight) {
		super(weight);
		this.origin=origin;
		this.destination=destination;
	}
	
	public boolean sameTraject (InEdge edge) {
		return (this.origin.equals(edge.getOrigin())&&this.destination.equals(edge.getDestination()));
	}

}
