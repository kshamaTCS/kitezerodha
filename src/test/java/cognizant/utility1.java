package cognizant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility1 {
public static String getTD(int rowindex, int columnindex) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\Downloads\\Framework\\DDF.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("DDf");
		String data = sh.getRow(0).getCell(0).getStringCellValue();
		return data;
	}
}

