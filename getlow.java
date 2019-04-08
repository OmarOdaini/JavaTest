import java.lang.Math;
import java.util.*;

class Point {
	
	private int Xval;
	private int Yval;

		
public Point(int x, int y) {
			Yval = y;
			Xval = x;
		}
		int GetX() {
			return Xval;
		}
		int GetY() {
			return Yval;
		}

}

public class getlow {
/*
- get distance
- create a class to contain point and distance (Hashtable)
- sort List based on distance
- return lowest

*/
public static void main(String args[]) {
	
	//Points giving
	int[][] arr = { {5,5}, {-6, -3}, {1, 3}, {4, -5}, {0, 2}};

	//Declare Table
	Hashtable<Double, Point> Table = new Hashtable<Double, Point>(); 

	//Initialize Table with values
	for (int i = 0; i < arr.length; i++)  //O(n) n == number of points
		Table.put(GetDistance(arr[i][0], arr[i][1]), new Point(arr[i][0], arr[i][1]));

	
	double LowestKey = GetLowest(Table);
	 
	 //Output the point with lowest distance
	 System.out.println("Closest point is: " + "{"+ Table.get(LowestKey).GetX() + ", "+ Table.get(LowestKey).GetY() + "}");
}


public static double GetDistance(int x, int y) {
	return Math.sqrt((x*x)+(y*y));
}

public static double GetLowest(Hashtable<Double, Point> Table) {
	double low = 0.0;	

	for (Map.Entry<Double, Point> pair : Table.entrySet()) 
		if(pair.getKey() > low)
			low = pair.getKey();

	return low;
}

}

