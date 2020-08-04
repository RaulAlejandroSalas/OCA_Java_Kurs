/**
 * 
 */
package ml.salastexido.gui.menubar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import ml.salastexido.gui.menubar.menu.FileMenu;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class MainFrameMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainFrameMenuBar() {
		//FileMenu Instance
		JMenu fileMenu = new FileMenu();
		fileMenu.setVisible(true);
		super.add(fileMenu);
		super.setVisible(true);
		
	}
	

}
