package br.com.us2star.gui;

public class SwingMain {
	
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SwingUserInterface.createAndShowGUI();
			}
		});
	}
}
