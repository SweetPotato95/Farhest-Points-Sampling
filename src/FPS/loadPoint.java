package FPS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class loadPoint{
	public void loadPoint(){
		
	}
	public Point[] readPoint(int size){
		Point[] ret = new Point[size];

		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\Zehua Zhang\\uot.txt");
			BufferedReader bf = new BufferedReader(fr);
			int index = 0;
			while(true){
				String inputStr = bf.readLine();
				if(inputStr == null)break;
				String[] list = inputStr.split(",");
				int vectorSize = list.length;
				double[] tmpVector = new double[vectorSize];
				for(int i =0 ;i<vectorSize;i++){
					double tmp = Double.valueOf(list[i]);
					tmpVector[i] = tmp;
				}
				ret[index++] = new Point(tmpVector);
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
}