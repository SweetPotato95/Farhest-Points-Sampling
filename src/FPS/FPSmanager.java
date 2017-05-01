package FPS;

import java.util.ArrayList;
import java.util.Random;

public class FPSmanager{
	int setSize;
	int samplePointSize;
	Point[] pointList;
	ArrayList<Integer> samplePoint = new ArrayList<Integer>();
	ArrayList<Integer> leftPoint = new ArrayList<Integer>();
	
	public FPSmanager(int size,Point[] list,int sampleSize){
		setSize = size;
		samplePointSize = sampleSize;
		pointList = new Point[size];
		for(int i =0 ;i<size;i++){
			pointList[i] = list[i];
			leftPoint.add(i);
		}
		
	}
	
	public void FPSProcess(){
		Random r1 = new Random();
		int startIndex = r1.nextInt(setSize);
		samplePoint.add(startIndex);
		leftPoint.remove(startIndex);
		System.out.println(startIndex);
		for(int k = 0;k<leftPoint.size();k++){
			System.out.print(leftPoint.get(k)+",");
		}
		System.out.println("");
		while(samplePoint.size() < samplePointSize){
			int curIndex = findFarhestPoint();
			samplePoint.add(new Integer(curIndex));
			leftPoint.remove(new Integer(curIndex));
			
			System.out.println(curIndex);
			for(int k = 0;k<leftPoint.size();k++){
				System.out.print(leftPoint.get(k)+",");
			}
			System.out.println("");
		}
		
	}
	
	public int findFarhestPoint(){
		int index = -1;
		double maxlength = 0;
		for(int i=0;i<leftPoint.size();i++){
			double distance = 0;
			//System.out.println("haha"+leftPoint.get(i));
			int iIndex = leftPoint.get(i);
			for(int j =0;j<samplePoint.size();j++){
				distance+=Point.distance(pointList[samplePoint.get(j)],pointList[iIndex]);
				}
			if (distance > maxlength){
				index = iIndex;
				maxlength = distance;
			}
		}
		return index;
	}
	
	
}