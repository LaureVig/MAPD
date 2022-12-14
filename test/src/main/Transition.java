package main;

import java.util.LinkedList;

public class Transition {
	private boolean activable;
	private LinkedList<Edge> edges;
	
	/**
	 * Constructor of Transition
	 * @param id
	 * @param activable
	 */
	public Transition(boolean activable, LinkedList<Edge> edges) {
		this.activable = activable;
		this.edges=edges;
	}
	
	// Getters and Setters

	public boolean isActivable() {
		return activable;
	}
	public void setActivable(boolean activable) {
		this.activable = activable;
	}
	
	// Methods
	public void doTransition() {
		for (int i=0;i<this.edges.size();i++) {
			this.edges.get(i).activate();
		}
		
	}
	
	public void checkActivable() {
		int i =0;
		boolean test = true;
		while (test==true && i<this.edges.size()) {
			test = test&&this.edges.get(i).isActivable();
		}
	}

	public LinkedList<Edge> getEdges() {
		return edges;
	}
	
	public void addEdge (Edge edge) {
		this.edges.add(edge);
	}
}
