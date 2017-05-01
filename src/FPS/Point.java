package FPS;
public class Point{
	double []pointValue;
	static int vectorCount = 4;
	public Point(double []featureVector){
		int size = featureVector.length;
		if (size!=vectorCount){
			System.out.println("Vector count wrong!.");
			return;
		}
		pointValue = new double[size];
		for(int i=0;i<size;i++){
			pointValue[i] = featureVector[i];
		}
		return;
	}
	public void showPoint(){
		for(int i=0;i<vectorCount;i++){
			if(i!=0)System.out.print(",");
			System.out.print(pointValue[i]);
		}
		System.out.println("\n");
		return;
	}
	static double distance(Point a,Point b){
		double distance = 0;
		for(int i=0;i<vectorCount;i++){
			distance += (a.pointValue[i] - b.pointValue[i])*(a.pointValue[i] - b.pointValue[i]);
		}
		return Math.sqrt(distance);
	}
	static double pointSetDistance(Point []a, Point b){
		double distance = 0;
		for(int i =0;i<a.length;i++){
			distance += distance(a[i],b);
		}
		return distance;
	}
}