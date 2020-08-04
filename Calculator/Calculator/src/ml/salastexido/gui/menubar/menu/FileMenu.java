/**
 * 
 */
package ml.salastexido.gui.menubar.menu;

import javax.swing.JMenu;

import ml.salastexido.gui.menubar.menu.menuItems.ExitItem;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class FileMenu extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileMenu() {
		super("File");
		ExitItem exitItem = new ExitItem();
		exitItem.setVisible(true);
		super.add(exitItem);
		super.setVisible(true);
		
		
	}
	
}
