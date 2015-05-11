package us2star.gui;
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
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import us.UsElementType;
import us2star.mapping.IstarData;
import us2star.xlsreader.XLSReader;
import us2star.xlstoeditor.UsData;
import us2star.xmicreator.CreateIstarXMI;

public class SwingUserInterface extends JPanel implements ActionListener {

	private final String newline = "\n";
	private JTextArea log;
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
	private UsData usData;
	private CreateIstarXMI xmiCreater;
	private IstarData mapping;
	private JScrollPane logScrollPane;

	public SwingUserInterface() {

		super(new BorderLayout());

		this.log = new JTextArea(8, 30);
		this.fc = new JFileChooser();
		this.openButton = new JButton("Open file...", createImageIcon("/icons/xls_icon.png"));
		this.toStarButton = new JButton("To Istar", createImageIcon("/icons/star_icon.png"));
		this.logClearButton = new JButton ("Log clear", createImageIcon("/icons/clear_icon.png"));
		this.infoButton = new JButton ("Informations", createImageIcon("/icons/info_icon.png"));
		this.deleteFileButton = new JButton("Delete file", createImageIcon("/icons/del_icon.png"));
		this.saveButton = new JButton("Save Istar", createImageIcon("/icons/save_icon.png"));
		this.buttonPanel = new JPanel();
		this.currentFilePanel = new JPanel();
		this.currentFileLabel = new JLabel();
		this.currentFileName = new JLabel();

		init();	
	}

	private void init() {
		logScrollPane();
		addActionListeners();
		disableButtons();
		setPreferredButtonSizes(145, 45);
		addButtonsToButtonPanel();
		initCurrentFilePanel();
		makeBorderLayout();
	}

	private void addActionListeners() {
		openButton.addActionListener(this);
		toStarButton.addActionListener(this);
		logClearButton.addActionListener(this);
		infoButton.addActionListener(this);
		deleteFileButton.addActionListener(this);
		saveButton.addActionListener(this);
	}

	private void disableButtons() {
		toStarButton.setEnabled(false);
		saveButton.setEnabled(false);
		deleteFileButton.setEnabled(false);
	}

	private void setPreferredButtonSizes(int x, int y) {
		openButton.setPreferredSize(new Dimension(x, y));
		toStarButton.setPreferredSize(new Dimension(x, y));
		logClearButton.setPreferredSize(new Dimension(x, y));
		infoButton.setPreferredSize(new Dimension(x, y));
		deleteFileButton.setPreferredSize(new Dimension(x, y));
		saveButton.setPreferredSize(new Dimension(x, y));
	}

	private void addButtonsToButtonPanel() {
		buttonPanel.add(openButton);
		buttonPanel.add(toStarButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(deleteFileButton);
		buttonPanel.add(logClearButton);
		buttonPanel.add(infoButton);
	}

	private void initCurrentFilePanel() {
		currentFileLabel.setText("Current EB file: ");
		currentFileName.setForeground(Color.red);
		currentFileName.setText("No file selected");
		currentFilePanel.add(currentFileLabel);
		currentFilePanel.add(currentFileName);
	}

	private void makeBorderLayout() {
		add(buttonPanel, BorderLayout.PAGE_START);
		add(logScrollPane, BorderLayout.CENTER);
		add(currentFilePanel, BorderLayout.PAGE_END);
	}

	private void logScrollPane() {
		log.setMargin(new Insets(5, 5, 5, 5));
		log.setEditable(false);
		this.logScrollPane = new JScrollPane(log);
	}


	private void infoButton() {
		log.append("- INFORMATIONS" + newline);
		log.append("- 1) This tool is integrated with Easybacklog (EB) tool." + newline);
		log.append("- 2) To access EB you need to access the site www.easybacklog.com. " + newline);
		log.append("- 3) To get start the mapping process in US2Star, you need to get a XLS file from EB." + newline);
		log.setCaretPosition(log.getDocument().getLength());

	}

	private void logClearButton() {
		log.setText("");
		log.setCaretPosition(log.getDocument().getLength());
	}
	
	private void printIstarTitle() {
		for (int i = 0 ; i < mapping.getIstar_compartments().size() ; i++) {
			log.append("~ " + mapping.getIstar_compartments().get(i).getType() + ": " + mapping.getIstar_compartments().get(i).getName() + newline);
		}
	}
	
	private void printIstarElements() {
		for (int i = 0 ; i < mapping.getIstar_elements().size() ; i++) {
			log.append("~ " + mapping.getIstar_elements().get(i).getType() + ": " + mapping.getIstar_elements().get(i).getName() + newline);
		}
	}
	
	private void printIstarActorLinks() {
		for (int i = 0 ; i < mapping.getIstar_actorLinks().size() ; i++) {
			log.append("~ " + mapping.getIstar_actorLinks().get(i).getType() + ": " + mapping.getIstar_actorLinks().get(i).getSource().getName() + " -> " + mapping.getIstar_actorLinks().get(i).getTarget().getName() + newline);
		}
	}
	
	private void printIstarDependencyLinks() {
		for (int i = 0 ; i < mapping.getIstar_dependencyLinks().size() ; i++) {
			log.append("~ " + mapping.getIstar_dependencyLinks().get(i).getType() + ": " + mapping.getIstar_dependencyLinks().get(i).getSource().getName() + " -> " + mapping.getIstar_dependencyLinks().get(i).getTarget().getName() + newline);
		}
	}

	private void toStarButton() {

		saveButton.setEnabled(true);
		this.mapping = new IstarData(usData);
		log.append("- Mapping " + getCurrentFile().getName() + " that contains user stories, to i* model..." + newline);
		log.append("~~~~~~~~ i* Model: " + mapping.getIstar_model().getTitle() + " ~~~~~~~~" + newline);
		printIstarTitle();
		printIstarElements();
		printIstarActorLinks();
		printIstarDependencyLinks();
		log.setCaretPosition(log.getDocument().getLength());
	}
	
	private void printUs() {
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
	}

	private void openButton() {

		int returnVal = fc.showOpenDialog(SwingUserInterface.this);

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
					usData = new UsData(file.getPath());
					printUs();
				}
			} 
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

	private void saveButton() throws ParserConfigurationException, TransformerException {

		xmiCreater = new CreateIstarXMI(mapping, currentFile.getAbsolutePath());
		log.append("~ File saved: " + newline);
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
			try {
				saveButton();
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (TransformerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = SwingUserInterface.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	private static void frameLocation(JFrame frame) {
		Toolkit kit = Toolkit.getDefaultToolkit();  
		Dimension tamanhoTela = kit.getScreenSize();  
		int width = tamanhoTela.width;  
		int height = tamanhoTela.height;  
		frame.setLocation( width / 3, height / 3 );
	}

	private boolean isXls(File file){
		if (!XLSReader.isXls(file)) {
			log.append("- ERROR: The file <" + file.getName() + "> haven't xls format." + newline);
			return false;
		}
		return XLSReader.isXls(file);
	}

	private boolean isEb(String path) {
		XLSReader reader = new XLSReader(path);
		if (!reader.isEb()) {
			log.append("- ERROR: The xls file <" + currentFile.getName() + "> wasn't exported from Easybacklog." + newline);
		}

		return reader.isEb();
	}

	private File getCurrentFile() {
		return currentFile;
	}

	private void setCurrentFile(File currentFile) {
		this.currentFile = currentFile;
	}

	public static void createAndShowGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("US2Star - User Stories To Star");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new SwingUserInterface();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		//log.append("- Welcome to US2Star!"+ newline);
		frame.pack();          
		frameLocation(frame);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}