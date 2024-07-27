package exercise;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.dvcs.Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExcelUtils {


		
//    private String filePath;
//    
//    public ExcelUtils () {
//    	this.filePath = filePath;
//    	
//    }
    
    public List<List<String>> readExcelData(String sheetName) throws IOException {
    	
    	List <List <String>> data = new ArrayList<> ();
    	FileInputStream fis = new FileInputStream("D:\\Data.xlsx");
    	
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	Sheet sheet = wb.getSheet(sheetName);    	
    	Iterator <Row> rowItr = sheet.iterator();    
    	while(rowItr.hasNext()) {
    	Row row =rowItr.next();
    	 
    	List <String> rowData = new ArrayList();
       Iterator <Cell> cellItr =  row.cellIterator();
       while(cellItr.hasNext()){
    	   
    	  Cell cell = cellItr.next();
       
    
         rowData.add(cell.getStringCellValue());
       }
       
       data.add(rowData);
       for (int i=0;i<data.size();i++) {
    	   
    	  System.out.println(data.get(i));
       }
       }
    	wb.close();
    	fis.close();
    	return data;
    }
    
    public static void main(String[] args) throws IOException {
		
    	ExcelUtils exl = new ExcelUtils();
    	exl.readExcelData("Data");
    	
//    	ArrayList al = new ArrayList(exl.readExcelData("Data"));
//    	al.get(0);
    	
    	
   
	}

}
       
