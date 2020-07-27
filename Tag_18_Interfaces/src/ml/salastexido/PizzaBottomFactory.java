/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 *
 */

public class PizzaBottomFactory extends APizzaBottom {
	

	public static APizzaBottom buildPizzaBottom(String type) {
		// TODO Auto-generated method stub
		APizzaBottom aPizzaBottom= null;
		switch(type) {
			case "CRUSTY" :
				aPizzaBottom=new PizzaBottomFactory(type,(int)3.40);
				break;
			case "MUNCHY" :
				aPizzaBottom=new PizzaBottomFactory(type,(int)3.95);
				break;
			case "CUSCINOSPECIALE" :
				aPizzaBottom=new PizzaBottomFactory(type,(int)4.95);
				break;	
		}
		return aPizzaBottom;
	}
	
	private PizzaBottomFactory(final String type,final int price) {
		this.price = price;
		this.type = type;
	
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public boolean isVegeteable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "PizzaBottomFactory [price=" + price + ", type=" + type + "]";
	}
	
	

}
