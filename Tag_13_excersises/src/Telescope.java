
public class Telescope {

	static int magnify = 2;
	
	public static void main(String[] args) {
		go();
	}
	
	static void go() {
		int magnify = 3;
		zoomIn();
	}

	static void zoomIn() {
		magnify*=5;
		System.out.println(magnify);
		zoomMore(magnify);
		System.out.println(magnify);
	}

	static void zoomMore(int magnify) { //work a copy of magnify attribute
		System.out.println("[zoomMore]: " + magnify);
		//here only the copy from magnitude is modify
		magnify*=7;
		System.out.println("[magnify*=7]: " + magnify);
	}
	
	
}
