/**
 * 
 */
package ml.salastexido;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class NormalKiln implements IKiln{

	private static int MAX_TEMPERATURE = 1000;
	private int currentTemperature;
	
	/**
	 * 
	 */
	public NormalKiln() {
		this.currentTemperature=0;
	}

	@Override
	public void burn(IMaterial material) {
		if(this.getCurrentTemperature() < MAX_TEMPERATURE) {
			material.willBeBurned();
			this.setCurrentTemperature(this.getCurrentTemperature()+10);
		}else {
			System.out.println("The Kiln is very hot...!!!");
			this.setCurrentTemperature(0);
		}
		
	}

	/**
	 * @return the mAX_TEMPERATURE
	 */
	public static int getMAX_TEMPERATURE() {
		return MAX_TEMPERATURE;
	}

	/**
	 * @param mAX_TEMPERATURE the mAX_TEMPERATURE to set
	 */
	public static void setMAX_TEMPERATURE(int mAX_TEMPERATURE) {
		MAX_TEMPERATURE = mAX_TEMPERATURE;
	}

	/**
	 * @return the currentTemperature
	 */
	public int getCurrentTemperature() {
		return currentTemperature;
	}

	/**
	 * @param currentTemperature the currentTemperature to set
	 */
	public void setCurrentTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
	}
	
	

}
