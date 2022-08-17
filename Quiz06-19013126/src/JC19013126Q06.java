import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Point {
	
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+ x + " , "+ y + ")";
	}
	
	public int sum() {
		return x + y;
	}	
	
}
public class JC19013126Q06 {
	
	public static void main(String args[]) {
		
		HashMap<Integer, Point> map = new HashMap<Integer, Point>();
		Point p1 = new Point(-10, -10);
		Point p2 = new Point(10, 10);
		Point p3 = new Point(20, 20);
		Point p4 = new Point(30, 30);
		
		map.put(p1.sum(), p1);
		map.put(p2.sum(), p2);
		map.put(p3.sum(), p3);
		map.put(p4.sum(), p4);
		
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		
		while(it.hasNext()) {
			int sum = it.next();
			Point tmp = map.get(sum);
			System.out.println(tmp);
		}
	}
}

