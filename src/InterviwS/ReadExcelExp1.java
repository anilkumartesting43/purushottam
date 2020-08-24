package InterviwS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExp1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Excel\\Anil.123.xlsx");
		FileInputStream fil=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fil);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("the data is:"+data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("the data is:"+data1);
		wb.close();
		

	}

}
