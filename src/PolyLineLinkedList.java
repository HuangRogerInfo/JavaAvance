package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class PolyLineLinkedList {
	private LinkedList<Point> listePoints;
	
	public PolyLineLinkedList() {
		listePoints = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		listePoints.add(p);
	}
	
	public int nbPoints() {
		return listePoints.size();
	}
	
	public boolean contains(Point p) {
		return listePoints.contains(p);
	}
}
