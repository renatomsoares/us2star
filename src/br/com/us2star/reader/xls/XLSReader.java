package br.com.us2star.reader.xls;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/**Classe responsável pela leitura do arquivo XLS.
 * @author Renato Mesquita
 * @version 1.00
 */

public class XLSReader {

	private FileInputStream file;
	private HSSFWorkbook workbook;
	private HSSFSheet sheet;
	private ArrayList<String> userStories;
	private String backlogName;

	public XLSReader(String path) throws IOException {

		this.file = new FileInputStream(new File(path));
		this.workbook = new HSSFWorkbook(file);
		this.sheet = workbook.getSheetAt(0);
		this.userStories = new ArrayList<String>();

		readDocument();
	}

	private void readDocument() {

		Iterator<Row> rowIterator = sheet.iterator();

		setBacklogName(rowIterator.next().getCell(0).getStringCellValue());

		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			//For each row, iterate through all the columns

			if  (row.getCell(2).getStringCellValue().contains("Como") &&
					(row.getCell(2).getStringCellValue().contains("Eu quero") &&
							(row.getCell(2).getStringCellValue().contains("Para que")))) {

				String userStory = row.getCell(2).getStringCellValue();
				//System.out.println(userStory);
				userStories.add(userStory);
			}
		}

		try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isEb() {

		Boolean isEb = false;
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();

		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			//For each row, iterate through all the columns

			if  (row.getCell(2).getStringCellValue().contains("Como") &&
					(row.getCell(2).getStringCellValue().contains("Eu quero") &&
							(row.getCell(2).getStringCellValue().contains("Para que")))) {

				isEb = true;
				break;
			}
		}

		return isEb;
	}

	public static boolean isXls(File file){
		String fileName = file.getName();
		String ext[] = fileName.split("\\.");
		return (ext[1].equals("xls"));
	}

	public ArrayList<String> getUserStories() {
		return userStories;
	}

	public String getBacklogName() {
		return backlogName;
	}

	public void setBacklogName(String backlogName) {
		this.backlogName = backlogName;
	}
}

