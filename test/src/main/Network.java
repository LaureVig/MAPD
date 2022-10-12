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
	
	public void addPlace(int id) {
		
	}
}
