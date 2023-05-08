package genericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consists of generic methods to read and write data into excel
 * 
 * @author T Pavan Kumar
 *
 */
public class ExcelFileLibrary {

	/**
	 * This method is used to read the data from specified excel file by sheet
	 * name,row number,cell number
	 * 
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetName, int rowNumber, int cellNumber)
			throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream(IConstantLibrary.excelFilePath);
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		String value = cell.getStringCellValue();
		workBook.close();
		return value;
	}

	/**
	 * This method will write the data into excel sheet for user specified sheet,
	 * row no and cell no
	 * 
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataIntoExcel(String sheetName, int rowNumber, int cellNumber, String value)
			throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream(IConstantLibrary.excelFilePath);
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.createCell(cellNumber);
		cell.setCellValue(value);
		FileOutputStream fileOutputStream = new FileOutputStream(IConstantLibrary.excelFilePath);
		workBook.write(fileOutputStream);
		workBook.close();
	}

	/**
	 * This method is used to read all data present in the specified excel sheet.
	 * 
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public Object[][] readMultileDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream(IConstantLibrary.excelFilePath);
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet(sheetName);
		int lastRowNumber = sheet.getLastRowNum();
		int lastCellNumer = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastRowNumber][lastCellNumer];
		for (int i = 0; i < lastRowNumber; i++) {
			for (int j = 0; j < lastCellNumer; j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}
		return data;
	}

	/**
	 * This method will provide the last row number utilized in a given sheet
	 * 
	 * @param sheetName
	 * @param rowNumber
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int getRowConunt(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream = new FileInputStream(IConstantLibrary.excelFilePath);
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet(sheetName);
		int rowCoun = sheet.getLastRowNum();
		workBook.close();
		return rowCoun;
	}

}
