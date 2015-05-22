package br.com.us2star.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

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

import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.istar.UsData2IstarData;
import br.com.us2star.mapping.us.EB2UsData;
import br.com.us2star.mapping.us.UsData;
import br.com.us2star.reader.xls.XLSReader;
import br.com.us2star.us.UsElementType;
import br.com.us2star.writer.xmi.CreateIstarXMI;

public class SwingUI extends JPanel implements ActionListener {

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
	private UsData2IstarData us2star_data;
	private IstarData istarData;
	private JScrollPane logScrollPane;
	private EB2UsData eb2usdata;

	public SwingUI() {

		super(new BorderLayout());

		this.log = new JTextArea(8, 30);
		this.fc = new JFileChooser();
		this.openButton = new JButton("Open file...", createImageIcon("/br/com/us2star/gui/icons/xls_icon.png"));
		this.toStarButton = new JButton("To Istar", createImageIcon("/br/com/us2star/gui/icons/star_icon.png"));
		this.logClearButton = new JButton ("Log clear", createImageIcon("/br/com/us2star/gui/icons/clear_icon.png"));
		this.infoButton = new JButton ("Informations", createImageIcon("/br/com/us2star/gui/icons/info_icon.png"));
		this.deleteFileButton = new JButton("Delete file", createImageIcon("/br/com/us2star/gui/icons/del_icon.png"));
		this.saveButton = new JButton("Save Istar", createImageIcon("/br/com/us2star/gui/icons/save_icon.png"));
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
			log.append("~ " + istarData.getIstar_model().getTitle() + newline);
	}
	
	private void printIstarCompartments() {
		for (int i = 0 ; i < istarData.getIstar_model().getCompartments().size() ; i++) {
			log.append("~ " + istarData.getIstar_model().getCompartments().get(i).getType() + ": " + istarData.getIstar_model().getCompartments().get(i).getName() + newline);
		}
	}
	
	private void printIstarElements() {
		for (int i = 0 ; i < istarData.getIstar_model().getElements().size() ; i++) {
			log.append("~ " + istarData.getIstar_model().getElements().get(i).getType() + ": " + istarData.getIstar_model().getElements().get(i).getName() + newline);
		}
	}
	
	private void printIstarElementsFromSystemActor() {
		for (int i = 0 ; i < istarData.getIstar_model().getCompartments().get(0).getElements().size() ; i++) {
			log.append("~ [SystemActor] " + istarData.getIstar_model().getCompartments().get(0).getElements().get(i).getType() + ": " + istarData.getIstar_model().getCompartments().get(0).getElements().get(i).getName() + newline);
		}
	}
	
	private void printIstarActorLinks() {
		for (int i = 0 ; i < istarData.getIstar_model().getActorLinks().size() ; i++) {
			log.append("~ " + istarData.getIstar_model().getActorLinks().get(i).getType() + ": " + istarData.getIstar_model().getActorLinks().get(i).getSource().getName() + " -> " + istarData.getIstar_model().getActorLinks().get(i).getTarget().getName() + newline);
		}
	}
	
	private void printIstarDependencyLinks() {
		for (int i = 0 ; i < istarData.getIstar_model().getDependencyLinks().size() ; i++) {
			log.append("~ " + istarData.getIstar_model().getDependencyLinks().get(i).getType() + ": " + istarData.getIstar_model().getDependencyLinks().get(i).getSource().getName() + " -> " + istarData.getIstar_model().getDependencyLinks().get(i).getTarget().getName() + newline);
		}
	}

	private void toStarButton() {

		saveButton.setEnabled(true);
		this.us2star_data = new UsData2IstarData(usData);
		this.istarData = us2star_data.getIstarData();
		log.append("- Mapping " + getCurrentFile().getName() + " that contains user stories, to i* model..." + newline);
		
		log.append("~~~~~~~~ i* Model: " + istarData.getIstar_model().getTitle() + " ~~~~~~~~" + newline);
		
		printIstarTitle();
		printIstarCompartments();
		printIstarElements();
		printIstarElementsFromSystemActor();
		printIstarActorLinks();
		printIstarDependencyLinks();
		log.setCaretPosition(log.getDocument().getLength());
	}
	
	private void printUs() {
		for (int i = 0 ; i < usData.getUs_model().getUss().size() ; i++) {
			log.append("ID: " + usData.getUs_model().getUss().get(i).getId() + newline);
			log.append("Role: " + usData.getUs_model().getUss().get(i).getElements().get(0).getDescription() + newline);
			log.append("Action: " + usData.getUs_model().getUss().get(i).getElements().get(1).getDescription() + newline);
			log.append("Goal: " + usData.getUs_model().getUss().get(i).getElements().get(2).getDescription() + newline);
		}
	}

	private void openButton() {

		int returnVal = fc.showOpenDialog(SwingUI.this);

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
					try {
						eb2usdata = new EB2UsData(file.getPath());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					usData = eb2usdata.getUsData();
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

		xmiCreater = new CreateIstarXMI(istarData, currentFile.getAbsolutePath());
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
		java.net.URL imgURL = SwingUI.class.getResource(path);
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
		XLSReader reader = null;
		try {
			reader = new XLSReader(path);
		} catch (IOException e) {
			log.append("- ERROR: Probably the XLS file exported by EB is protected.");
			log.append("- SUGGESTION: Open the file and save informing the file type 'XML Spreadsheet 2003'");

			System.out.println("asasa");
			e.printStackTrace();
		}
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
		JComponent newContentPane = new SwingUI();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		//log.append("- Welcome to US2Star!"+ newline);
		frame.pack();          
		frameLocation(frame);
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}