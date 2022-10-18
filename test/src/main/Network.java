package main;

import java.util.LinkedList;

public class Network {
	private LinkedList<Edge> edges;
	private LinkedList<Place> places;
	private LinkedList<Transition> transitions;
	
	public Network(LinkedList<Edge> edges, LinkedList<Place> places, LinkedList<Transition> transitions) {
		this.edges = edges;
		this.places = places;
		this.transitions = transitions;
	}
	
	public Network() {
		this.edges = new LinkedList<Edge>();
		this.places = new LinkedList<Place>();
		this.transitions =new LinkedList<Transition>();
	}

	public LinkedList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(LinkedList<Edge> edges) {
		this.edges = edges;
	}

	public LinkedList<Place> getPlaces() {
		return places;
	}

	public void setPlaces(LinkedList<Place> places) {
		this.places = places;
	}

	public LinkedList<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(LinkedList<Transition> transitions) {
		this.transitions = transitions;
	}
	
	public void addPlace(Place place) {
		if (!(places.contains(place))) {
			this.places.add(place);
		}
	}
	
	public void deletePlace(Place place) {
		this.places.removeFirstOccurrence(place);
	}
	
	public Place findPlace(int index) {
		return places.get(index);
	}
	
	public void addTransition(Transition transition) {
		if(!(transitions.contains(transition))) {
			transitions.add(transition);
		}
	}
	
	public void deleteTransition(Transition transition) {
		this.transitions.removeFirstOccurrence(transition);
	}
	
	public Transition findTransition(int index) {
		return transitions.get(index);
	}
	
	public void addEdge(Edge edge) {
		if (edge instanceof InEdge) {
			Place destination = ((InEdge) edge).getDestination();
			LinkedList<Edge> edges = destination.getEdges();
			boolean test = false;
			int i = 0;
			while (i<edges.size() && test==false) {
				if (edges.get(i) instanceof InEdge) {
					test = ((InEdge) edge).sameTraject((InEdge)edges.get(i));
				}
			}
			if (test==false) {
				this.edges.add(edge);
				((InEdge) edge).getDestination().addEdge(edge);
				((InEdge) edge).getOrigin().addEdge(edge);
			}
		}
		else {
			Place origin = ((OutEdge) edge).getOrigin();
			LinkedList<Edge> edges = origin.getEdges();
			boolean test = false;
			int i = 0;
			while (i<edges.size() && test==false) {
				if (edges.get(i) instanceof OutEdge) {
					test = ((OutEdge) edge).sameTraject((OutEdge)edges.get(i));
				}
			}
			if (test==false) {
				this.edges.add(edge);
				((OutEdge) edge).getDestination().addEdge(edge);
				((OutEdge) edge).getOrigin().addEdge(edge);
			}
		}
	}
	
	public void deleteEdge(Edge edge) {
		this.edges.removeFirstOccurrence(edge);
	}
	
	public Edge findEdge(int index) {
		return edges.get(index);
	}
	
	public void editWeight(Edge edge, int weight) {
		edge.setWeight(weight);
	}
	
	public void changeNumberOfTokens(Place place, int numberOfTokens) {
		place.setNumberOfTokens(numberOfTokens);
	}
	
	public void step() {
		LinkedList<Transition> fireable = this.getFirable();
		int size = fireable.size();
		fireable.get(0).doTransition();
	}
	
	public LinkedList<Transition> getFirable() {
		int size=transitions.size();
		LinkedList<Transition> fireable = new LinkedList<Transition>();
		for(int i=0;i<size;i++) {
			Transition transition = this.transitions.get(i);
  			transition.checkActivable();
			if (transition.isActivable()) {
				fireable.add(transition);
			}
		}
		return fireable;
	}
}
