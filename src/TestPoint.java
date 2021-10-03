import java.util.ArrayList;

public class TestPoint {
	
	public static void main(String[] args) {
		//EXERCICE 2
		Point point = new Point(1, 2);
		
		// Question 7
		System.out.println("Le nombre total de points cree est de : " + Point.getNbPoint());
		
		// Question 9
		System.out.println(point);
		
		//EXERCICE 3
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		//Question 2
		System.out.println(p1.isSameAs(p3));
		
		//Question 3
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		//EXERCICE 4
		PolyLine poly1 = new PolyLine(5);
		poly1.add(p3);
		poly1.add(p1);
		poly1.add(null);
		
		System.out.println(poly1.nbPoints());
		System.out.println(poly1.contains(p1));
		
		//Question 6
		PolyLineLinkedList poly2 = new PolyLineLinkedList();
		poly2.add(p3);
		poly2.add(p1);
		
		System.out.println(poly2.nbPoints());
		System.out.println(poly2.contains(p1));
		
		//EXERCICE 5 Question 5
		Circle c = new Circle(p1,1);
		Circle c2 = new Circle(p1,2);
		c2.translate(1, 1);
		
		System.out.println(c+" "+c2);
		
		//Question 6
		Circle c3= new Circle(new Point(1,2),1);
		c3.getCenter().translate(1, 1);
		System.out.println(c);
		
		//Question 8
		Circle c4 = new Circle(new Point(5,6),3);
		System.out.println(c4.contains(new Point(8,6)));
		System.out.println(c4.contains(new Point(8,7)));
		
		//EXERCICE 6
		Ring r = new Ring(new Point(1,2),1,2);
		Ring r2 = new Ring(new Point(1,2),1,2);
		System.out.println(r);
		System.out.println(r.equals(r2));
	}
}
