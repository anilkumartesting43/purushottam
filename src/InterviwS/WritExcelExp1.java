package InterviwS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritExcelExp1 {

	public static void main(String[] args) throws IOException {
	File fle =new File("C:\\Excel\\Anil.123.xlsx");
	FileInputStream fis=new FileInputStream(fle);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    
	}

}
