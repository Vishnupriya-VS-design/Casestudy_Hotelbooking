package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public String Datafromexcel(String Name) throws IOException
	{
//		String path=System.getProperty("C:\\ProgramData\\Eclipse\\eclipse-workspace\\eclipse-workspace\\HotelBooking\\src\\test\\resources\\testData\\BookingDetails.xlsx");
		FileInputStream readstream = new FileInputStream(new File("C:\\Users\\dg498774\\OneDrive - Sprint\\Casestudy"));
		XSSFWorkbook workbook = new XSSFWorkbook(readstream);
		XSSFSheet Customerdetails = workbook.getSheetAt(0);
		String Value= "";
		for(int i=1;i<Customerdetails.getLastRowNum();i++)
		{
			XSSFRow rowval = Customerdetails.getRow(i);
					
			if(rowval.getCell(0).getStringCellValue().equalsIgnoreCase(Name)) {
				Name = rowval.getCell(1).getStringCellValue();
			}
		}
		workbook.close();
		
		return Value;
		
	}

}
