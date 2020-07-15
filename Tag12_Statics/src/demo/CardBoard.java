package demo;

public class CardBoard {
	
	Short story =200;
	CardBoard go(CardBoard cb) {
		cb =null;
		return cb;
	}
	
	public static void main(String[] args) {
		CardBoard c1 = new CardBoard();
		CardBoard c2 = new CardBoard();
		CardBoard c3 = c1.go(c2);
		c1=null;
		byte d = 4;
		int a = (int)123.456;
		byte b = (byte)123456;
		//byte c = d + 7;
	}

}
