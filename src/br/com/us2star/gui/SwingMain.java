package br.com.us2star.gui;

/**Classe para chamar a gui, SwingUI.
 * @author Renato Mesquita
 * @version 1.00
 */
public class SwingMain {
	
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SwingUI.createAndShowGUI();
			}
		});
	}
}
