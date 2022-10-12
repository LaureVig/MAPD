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
		if(!(edges.contains(edge))) {
			edges.add(edge);
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
		
	}
	public LinkedList<Transition> getFirable() {
		int size=transitions.size();
		LinkedList<Transition> fireable = new LinkedList<Transition>();
		for(int i=0;i<size;i++) {
			Transition transition = this.transitions.get(i);
//			transition.checkActivable();
//			if (transition.isActivable()) {
//				fireable.add(transition);
//			}
		}
		return fireable;
	}
}
