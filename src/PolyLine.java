public class PolyLine {
	private Point[] listePoints;
	
	public PolyLine() {
		// TODO Auto-generated constructor stub
		listePoints = new Point[5];
	}
	
	public PolyLine(int n) {
		// TODO Auto-generated constructor stub
		listePoints = new Point[n];
	}
	
	public void add(Point p) {
		for(int i = 0; i<listePoints.length;i++) {
			if(listePoints[i] == null) {
				listePoints[i] = p;
				break;
			}
		}
	}
	
	public int pointCapacity() {
		return listePoints.length;
	}

	public int nbPoints() {
		int nb = 0;
		for(int i = 0; i< listePoints.length; i++) {
			if(listePoints[i]!=null) {
				nb++;
			}
		}
		return nb;
	}
	
	public boolean contains(Point p) {
		for(Point point: listePoints) {
			if(point.equals(p)) {
				return true;
			}
		}
		return false;
	}
}
