package vinaykumar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {

	@DataProvider(name="dataa")
	public String[][] loginData() throws Exception{
		
		File file=new File(System.getProperty("user.dir")+"\\Resources\\Book1.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rows=ws.getPhysicalNumberOfRows();
		int cols=ws.getRow(0).getLastCellNum();
		
		String[][] data=new String[rows-1][cols];
		for(int i=0;i<rows-1;i++)
		{
			for(int j=0;j<cols;j++)
			{
				DataFormatter df=new DataFormatter();
			    data[i][j]=df.formatCellValue(ws.getRow(i+1).getCell(j));
			}
			System.out.println();
		}
		
		wb.close();
		fis.close();
		
		return data;
		
//		for(String[] da:data)
//		{
//			System.out.println(Arrays.toString(da));
//		}
		
		
		

	}

}
