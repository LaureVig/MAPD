package main;

public class InEdge extends Edge{
	

	private Transition origin;
	private Place destination;

	@Override
	public void activate() {
		this.destination.setNumberOfTokens(this.destination.getNumberOfTokens()+this.getWeight());
	}
	
	public InEdge(Transition origin, Place destination,int id, int weight) {
		super(id, weight);
		this.origin=origin;
		this.destination=destination;
	}

}
