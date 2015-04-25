package us2star;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import us.UsElementType;
import us2star.mapping.IstarMapping;
import us2star.xlsreader.XLSReader;
import us2star.xlstoeditor.UsDataGenerator;

public class SwingMain extends JPanel implements ActionListener {

	static private final String newline = "\n";
	static JTextArea log;
	private JButton openButton;
	private JButton toStarButton;
	private JButton logClearButton;
	private JButton infoButton;
	private JButton deleteFileButton;
	private JButton saveButton;
	private JFileChooser fc;
	private File currentFile;
	private final JLabel currentFileLabel;
	private JLabel currentFileName;
	private JPanel buttonPanel;
	private JPanel currentFilePanel;
	private UsDataGenerator usData;

	public SwingMain() {

		super(new BorderLayout());

		this.log = new JTextArea(8, 30);
		this.fc = new JFileChooser();
		this.openButton = new JButton("Open file...", createImageIcon("/icons/xls_icon.png"));
		this.toStarButton = new JButton("To Istar", createImageIcon("/icons/us2star_icon.png"));
		this.logClearButton = new JButton ("Log clear", createImageIcon("/icons/clear_icon.png"));
		this.infoButton = new JButton ("Informations", createImageIcon("/icons/info_icon.png"));
		this.deleteFileButton = new JButton("Delete file", createImageIcon("/icons/x_icon.png"));
		this.saveButton = new JButton("Save Istar", createImageIcon("/icons/save_icon.png"));
		this.buttonPanel = new JPanel();
		this.currentFilePanel = new JPanel();
		this.currentFileLabel = new JLabel();
		this.currentFileName = new JLabel();

		init ();	
	}

	private void init() {
		log.setMargin(new Insets(5, 5, 5, 5));
		log.setEditable(false);
		JScrollPane logScrollPane = new JScrollPane(log);
		//fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		openButton.addActionListener(this);
		toStarButton.setEnabled(false);
		toStarButton.addActionListener(this);
		logClearButton.addActionListener(this);
		infoButton.addActionListener(this);
		deleteFileButton.addActionListener(this);
		saveButton.addActionListener(this);
		saveButton.setEnabled(false);
		deleteFileButton.setEnabled(false);
		deleteFileButton.setMargin(new Insets(2, 2, 2, 2));
		
		openButton.setPreferredSize(new Dimension(145, 45));
		toStarButton.setPreferredSize(new Dimension(145, 45));
		logClearButton.setPreferredSize(new Dimension(145, 45));
		infoButton.setPreferredSize(new Dimension(145, 45));
		deleteFileButton.setPreferredSize(new Dimension(145, 45));
		saveButton.setPreferredSize(new Dimension(145, 45));
		
		
		
		buttonPanel.add(openButton);
		buttonPanel.add(toStarButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(deleteFileButton);
		buttonPanel.add(logClearButton);
		buttonPanel.add(infoButton);
		currentFileLabel.setText("Current EB file: ");
		currentFileName.setForeground(Color.red);
		currentFileName.setText("No file selected");
		currentFilePanel.add(currentFileLabel);
		currentFilePanel.add(currentFileName);
		add(buttonPanel, BorderLayout.PAGE_START);
		add(logScrollPane, BorderLayout.CENTER);
		add(currentFilePanel, BorderLayout.PAGE_END);
	}
	
	private void infoButton() {
		log.append("- INFORMATIONS" + newline);
		log.append("- 1) This tool is integrated with the Easybacklog (EB) tool." + newline);
		log.append("- 2) To access EB you need to access the site www.easybacklog.com. " + newline);
		log.append("- 3) To start the mapping process in US2Star, you need to get a XLS file from EB." + newline);

		log.setCaretPosition(log.getDocument().getLength());

	}
	
	private void logClearButton() {
		log.setText("");
		log.setCaretPosition(log.getDocument().getLength());

	}

	private void toStarButton() {

		saveButton.setEnabled(true);
		
		log.append("- Mapping " + getCurrentFile().getName() + " that contains user stories, to i* model..." + newline);
		
		IstarMapping mapping = new IstarMapping(usData);
		
		log.append("~~~~~~~~~~~~~~~~ i* Model: " + mapping.getIstar_model().getTitle() + " ~~~~~~~~~~~~~~~~" + newline);

		
		for (int i = 0 ; i < mapping.getIstar_compartments().size() ; i++) {
			log.append("~ " + mapping.getIstar_compartments().get(i).getType() + ": " + mapping.getIstar_compartments().get(i).getName() + newline);
		}
		
		for (int i = 0 ; i < mapping.getIstar_elements().size() ; i++) {
			log.append("~ " + mapping.getIstar_elements().get(i).getType() + ": " + mapping.getIstar_elements().get(i).getName() + newline);
		}
		
		for (int i = 0 ; i < mapping.getIstar_actorLinks().size() ; i++) {
			log.append("~ " + mapping.getIstar_actorLinks().get(i).getType() + ": " + mapping.getIstar_actorLinks().get(i).getSource().getName() + " -> " + mapping.getIstar_actorLinks().get(i).getTarget().getName() + newline);
		}
		
		for (int i = 0 ; i < mapping.getIstar_dependencyLinks().size() ; i++) {
			log.append("~ " + mapping.getIstar_dependencyLinks().get(i).getType() + ": " + mapping.getIstar_dependencyLinks().get(i).getSource().getName() + " -> " + mapping.getIstar_dependencyLinks().get(i).getTarget().getName() + newline);
		}
		
		log.setCaretPosition(log.getDocument().getLength());

	}

	private void openButton() {

		int returnVal = fc.showOpenDialog(SwingMain.this);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();

			log.append("- Reading file <" + file.getName() + ">." + newline);

			if (isXls(file)) {

				if (isEb(file.getPath())) {

					toStarButton.setEnabled(true);
					deleteFileButton.setEnabled(true);
					currentFileName.setForeground(new Color(35, 142, 35));
					currentFileName.setText(file.getName());

					setCurrentFile(file);				

					usData = new UsDataGenerator(file.getPath());

					for (int i = 0 ; i < usData.getUs_elements().size() ; i++) {

						if (usData.getUs_elements().get(i).getType() == UsElementType.ROLE) {
							log.append("- User Story" + newline);
							log.append("     Role: " + usData.getUs_elements().get(i).getDescription() + newline);
						} else if (usData.getUs_elements().get(i).getType() == UsElementType.ACTION) {
							log.append("     Action: " + usData.getUs_elements().get(i).getDescription() + newline);
						} else if (usData.getUs_elements().get(i).getType() == UsElementType.GOAL) {
							log.append("     Goal: " + usData.getUs_elements().get(i).getDescription() + newline);
						}
					}
				} else
					log.append("- ERROR: The xls file <" + file.getName() + "> wasn't exported from Easybacklog." + newline);
			} else
				log.append("- ERROR: The file <" + file.getName() + "> haven't xls format." + newline);
		} else
			log.append("- WARNING: Open command cancelled by user." + newline);

		log.setCaretPosition(log.getDocument().getLength());
	}
	
	private void deleteFileButton() {
		
		this.currentFile = null;
		this.currentFileName.setText("No file selected");
		this.currentFileName.setForeground(Color.red);
		this.toStarButton.setEnabled(false);
		this.saveButton.setEnabled(false);
		this.deleteFileButton.setEnabled(false);
		log.append("- Current file deleted!");
	}
	
	private void saveButton() {
		log.append("~ WARNING: This function isn't implemented!" + newline);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == openButton) {
			openButton();
		} else if (e.getSource() == toStarButton) {
			toStarButton();
		} else if (e.getSource() == logClearButton) {
			logClearButton();
		} else if (e.getSource() == infoButton) {
			infoButton();
		} else if (e.getSource() == deleteFileButton) {
			deleteFileButton();
		} else if (e.getSource() == saveButton) {
			saveButton();
		}
	}

	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = SwingMain.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	private static void createAndShowGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);

		JFrame frame = new JFrame("US2Star - User Stories To Star");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent newContentPane = new SwingMain();

		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);

		log.append("- Welcome to US2Star!"+ newline);

		frame.pack();          
		frameLocation(frame);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	private static void frameLocation(JFrame frame) {
		Toolkit kit = Toolkit.getDefaultToolkit();  
		Dimension tamanhoTela = kit.getScreenSize();  
		int width = tamanhoTela.width;  
		int height = tamanhoTela.height;  
		frame.setLocation( width / 3, height / 3 );
	}

	private boolean isXls(File file){
		String fileName = file.getName();
		String ext[] = fileName.split("\\.");
		return (ext[1].equals("xls"));
	}

	private boolean isEb(String path) {
		XLSReader reader = new XLSReader(path);
		return reader.isEb();
	}

	public File getCurrentFile() {
		return currentFile;
	}

	public void setCurrentFile(File currentFile) {
		this.currentFile = currentFile;
	}

	public UsDataGenerator getUsData() {
		return usData;
	}

	public void setUsData(UsDataGenerator usData) {
		this.usData = usData;
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
