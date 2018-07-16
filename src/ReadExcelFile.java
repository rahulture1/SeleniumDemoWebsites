import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//How to read excel files using Apache POI
public class ReadExcelFile {
	    public static void main(String[] args) throws IOException  {
		// I have placed an excel file 'Test.xlsx' in my D Drive
		FileInputStream fis = new FileInputStream("D:\\test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		for (int i = 0; i < rowcount + 1; i++) {
		Row row = sheet.getRow(i);
			
		// Create a loop to print cell values in a row
		//System.out.println("row : "+row.getLastCellNum());
		for (int j = 0; j < row.getLastCellNum(); j++) {

		// Print Excel data in console
		System.out.print(row.getCell(j).getStringCellValue() + "|| ");
		}
		System.out.println();
		}
	    }
        }