package package02;

import java.io.File;
import java.io.FileInputStream;

public class ReadingTestDataFromExcelSheet {

	public static Object[][]getTestDataFromExcel(String sheetName)
	{

		File excelFile = new File(System.getProperty("user.dir"));
		XSSFWorkbook workbook= null;
		
		try
		{
			FileInputStream fisFile = new  FileInputStream(excelFile);
			workbook = new XSSFWorkbook(fisFile);	
		}
		
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
		





	}
}
