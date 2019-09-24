package Apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {


public static void main(String[] args) throws IOException {
 //File file =);
 FileInputStream file = new FileInputStream(new File("C:\\Users\\SAMSUNG\\Desktop\\new.xlsx"));
 XSSFWorkbook workbook = new XSSFWorkbook(file);
    XSSFSheet sheet=workbook.getSheetAt(0);
   
    Iterator<Row> rowIterator=sheet.iterator();
    while(rowIterator.hasNext())
    {
     Row row=rowIterator.next();
     Iterator<Cell> cellIterator=row.cellIterator();
     //XSSFCell cell =row.createCell(0);
     while(cellIterator.hasNext()) {
      //new Cell.setCellValue("");
      //new Cell.setCellType(cell.getCellType());
     
      Cell cell=cellIterator.next();
     
      switch(cell.getCellType())
      {
      case NUMERIC:
       System.out.println(cell.getNumericCellValue()+"\t");
       break;
      case STRING:
       System.out.println(cell.getStringCellValue()+"\t");
       break;
      }
     }
     System.out.println("");
    }
    file.close();
}
}