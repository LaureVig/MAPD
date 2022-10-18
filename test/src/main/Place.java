package main;

import java.util.LinkedList;

public class Place {
	private int numberOfTokens;
	private LinkedList<Edge> edges; 
	
	/**
	 * Constructor of Place
	 * @param id
	 * @param numberOfTokens
	 */
	public Place(int numberOfTokens, LinkedList<Edge> edges) {
		this.numberOfTokens = numberOfTokens;
		this.edges = edges;
	}
	

	public int getNumberOfTokens() {
		return numberOfTokens;
	}
	public void setNumberOfTokens(int numberOfTokens) {
		this.numberOfTokens = numberOfTokens;
	}
	
	public void checkActivable() {
		for (int i = 0; i<this.edges.size();i++) {
			this.edges.get(i).checkActivable(this.numberOfTokens);
		}
	}


	public LinkedList<Edge> getEdges() {
		return edges;
	}
	
	public void addEdge (Edge edge) {
		this.edges.add(edge);
	}
	
}
