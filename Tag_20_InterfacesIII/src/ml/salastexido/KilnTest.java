/**
 * 
 */
package ml.salastexido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class KilnTest {

	public static void main(String[] args) {
		List<IMaterial> materials = new ArrayList<>();
		materials.add(new PaperBoard());
		materials.add(new Plastic());
		materials.add(new Wood());
		
		IKiln kiln = new NormalKiln();
		Iterator<IMaterial> it = materials.iterator();
		while(it.hasNext()) {
			IMaterial material = it.next();
			kiln.burn(material);
		}
		
		
	}
}
