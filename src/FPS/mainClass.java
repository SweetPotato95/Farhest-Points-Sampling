package FPS;
public class mainClass{
	public static void main(String []args){
		loadPoint lp = new loadPoint();
		Point[] pointList = lp.readPoint(100);
		FPSmanager fpsManager = new FPSmanager(40,pointList,3);
		fpsManager.FPSProcess();
	}
}