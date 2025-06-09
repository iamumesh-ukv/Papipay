package package02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ReadingTestDataFromExcelSheet {


	@Test(dataProvider="CredentialsSupplier")
	public void loginTest(String username, String password)
	{
		System.out.println(username  + "------------------ "+ password);
	}

	@DataProvider(name="CredentialsSupplier")
	public Object[][] dataSupplier() throws IOException
	{

		File excelFile = new File(System.getProperty("user.dir")+"\\testdata01.xlsx");
		FileInputStream fisFile = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fisFile);
		XSSFSheet sheet = workbook.getSheet("loginpage");

		int rowCount = sheet.getLastRowNum();
		int coulmnCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][coulmnCount];

		for(int r=0; r<rowCount; r++)
		{
			XSSFRow row = sheet.getRow(r+1);

			for(int c=0; c<coulmnCount; c++)
			{

				XSSFCell cell = row.getCell(c);

				CellType cellType = cell.getCellType();

				switch(cellType)
				{
				case STRING:
					data [r][c] = cell.getStringCellValue();
					break;

				case NUMERIC:
					data[r][c] = Integer.toString((int)cell.getNumericCellValue());
					break;

				case BOOLEAN:
					data[r][c] = cell.getBooleanCellValue();
					break;
				}
			} 
		}
		
	return data;
	}	
}

