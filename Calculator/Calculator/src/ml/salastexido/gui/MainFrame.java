/**
 * 
 */
package ml.salastexido.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ml.salastexido.gui.labels.OutPutLabel;
import ml.salastexido.gui.menubar.MainFrameMenuBar;
import ml.salastexido.gui.panels.MainPanel;



/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class MainFrame extends JFrame {
   
	private JButton[] jbnButtons; 
	private JPanel jplButtons;
	private JPanel jplControl;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		this.jplButtons = new JPanel();
		this.jplControl = new JPanel();
		this.jbnButtons = new JButton[22];
		
		
		super.setSize(241, 217);
		super.setTitle("Calculator...");
		super.setLocation(400, 250);
		
		
		//MainFrameMenuBar Instance
		MainFrameMenuBar menuFrameMenuBar = new MainFrameMenuBar();
		menuFrameMenuBar.setVisible(true);
		super.setJMenuBar(menuFrameMenuBar);
		
		
		
		//Frame layout Manager 
		JPanel mainPanel = new MainPanel();
		//ShowResults		
		JLabel outputLabel = new OutPutLabel();
		outputLabel.setHorizontalTextPosition(JLabel.RIGHT);
		
		outputLabel.setBackground(Color.WHITE);
		outputLabel.setOpaque(true);
		
		JPanel results = new JPanel();
		results.setSize(250, super.getHeight());
		results.setBackground(Color.BLUE);
		results.setVisible(true);
		
		//create numeric JButtons
//		for(int i=0;i<=9;i++) {
//			//set each JButton label to the value of index
//			jbnButtons[i] = new JButton(String.valueOf(i));	
//		}
//		//Create operator JButtons
//		jbnButtons[10] = new JButton("+/-");
//		jbnButtons[11] = new JButton(".");
//		jbnButtons[12] = new JButton("=");
//		jbnButtons[13] = new JButton("/");
//		jbnButtons[14] = new JButton("*");
//		jbnButtons[15] = new JButton("-");
//		jbnButtons[16] = new JButton("+");
//		jbnButtons[17] = new JButton("sqrt");
//		jbnButtons[18] = new JButton("1/x");
//		jbnButtons[19] = new JButton("%");
//		
//		jplControl.setLayout(new GridLayout(1, 2, 2, 2));
//		jbnButtons[20] = new JButton(" CE ");
//		jbnButtons[21] = new JButton("C");
//		jplControl.add(jbnButtons[20]);
//		jplControl.add(jbnButtons[21]);
//		
//		
//		//create grid 4x5
//		jplButtons.setLayout(new GridLayout(4,5,2,2));
//		//First row
//		for(int i=7;i<=9;i++) {
//			jplButtons.add(jbnButtons[i]);
//		}
//		//Second row
//		for(int i=4;i<=6;i++) {
//			jplButtons.add(jbnButtons[i]);	
//		}
//		//three row
//		for(int i=1;i<=3;i++) {
//			jplButtons.add(jbnButtons[i]);
//		}
//		
//		//Four row
//		// add 0, +/-, ., +, and =
//		jplButtons.add(jbnButtons[0]);
//		jplButtons.add(jbnButtons[10]);
//		jplButtons.add(jbnButtons[11]);
//		jplButtons.add(jbnButtons[16]);
//		jplButtons.add(jbnButtons[12]);
//	
//		
//		mainPanel.setLayout(new BorderLayout());
//		mainPanel.add(jplControl,BorderLayout.EAST);
//		mainPanel.add(jplButtons,BorderLayout.SOUTH);
//		
//		
//		super.add(outputLabel,BorderLayout.NORTH);
//		//add Component to MainFrame
//		super.add(mainPanel,BorderLayout.SOUTH);
//	
//		//Setting Options Main Frame
		super.setLayout(new BorderLayout(3,3));
		super.add(results, BorderLayout.NORTH);	
		super.setBackground(Color.GRAY);
		super.setVisible(true);
//	
		
		
	}

}
