package us.us2star;
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
import us.xlsreader.XLSReader;
import us.xlstoeditor.EditorDataGenerator;

public class SwingMain extends JPanel implements ActionListener {

	static private final String newline = "\n";
	static JTextArea log;
	private JButton openButton;
	private JButton toStarButton;
	private JFileChooser fc;
	private File currentFile;
	private final JLabel currentFileLabel;
	private JLabel currentFileName;
	private JPanel buttonPanel;
	private JPanel currentFilePanel;

	public SwingMain() {

		super(new BorderLayout());

		this.log = new JTextArea(8, 30);
		this.fc = new JFileChooser();
		this.openButton = new JButton("Open File...", createImageIcon("/xls_icon.png"));
		this.toStarButton = new JButton("To i*", createImageIcon("/us2star_icon_2.png"));
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
		buttonPanel.add(openButton);
		buttonPanel.add(toStarButton);
		currentFileLabel.setText("Current EB file: ");
		currentFileName.setForeground(Color.red);
		currentFileName.setText("No file selected");
		currentFilePanel.add(currentFileLabel);
		currentFilePanel.add(currentFileName);
		add(buttonPanel, BorderLayout.PAGE_START);
		add(logScrollPane, BorderLayout.CENTER);
		add(currentFilePanel, BorderLayout.PAGE_END);
	}

	private void toStarButton() {

		log.append("- Mapping " + getCurrentFile().getName() + " that contains user stories, to i* model..." + newline);
	}

	private void openButton() {

		int returnVal = fc.showOpenDialog(SwingMain.this);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();

			log.append("- Reading file <" + file.getName() + ">." + newline);

			if (isXls(file)) {

				if (isEb(file.getPath())) {

					toStarButton.setEnabled(true);
					currentFileName.setForeground(new Color(35, 142, 35));
					currentFileName.setText(file.getName());

					setCurrentFile(file);				

					EditorDataGenerator dataGenerator = new EditorDataGenerator(file.getPath());

					for (int i = 0 ; i < dataGenerator.getUs_elements().size() ; i++) {

						if (dataGenerator.getUs_elements().get(i).getType() == UsElementType.ROLE) {
							log.append("- User Story" + newline);
							log.append("     Role: " + dataGenerator.getUs_elements().get(i).getDescription() + newline);
						} else if (dataGenerator.getUs_elements().get(i).getType() == UsElementType.ACTION) {
							log.append("     Action: " + dataGenerator.getUs_elements().get(i).getDescription() + newline);
						} else if (dataGenerator.getUs_elements().get(i).getType() == UsElementType.GOAL) {
							log.append("     Goal: " + dataGenerator.getUs_elements().get(i).getDescription() + newline);
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

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == openButton) {
			openButton();
		} else if (e.getSource() == toStarButton) {
			toStarButton();
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

		JFrame frame = new JFrame("US2Star - Integrated with easybacklog.com");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent newContentPane = new SwingMain();

		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);

		log.append("- Tool integrated with Easybacklog (EB)."+ newline);

		frame.pack();          
		frameLocation(frame);
		frame.setVisible(true);
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

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
