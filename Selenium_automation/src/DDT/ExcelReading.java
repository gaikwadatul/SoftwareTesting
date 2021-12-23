package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {
private static final int STRING = 0;
private static final int NUMERIC = 1;
private static final int BLANK = 2;
private static final int BOOLEAN = 3;
@Test
  public void getSheetName() throws FileNotFoundException, IOException {
   // 1.file location
   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
   //2.cteate instance of requirement workbook
   XSSFWorkbook workbook = new  XSSFWorkbook(fis); 
   //3. perform operation of sheet
   int sheetcount=workbook.getNumberOfSheets();  //give the sheet count present
   System.out.println("sheet count :"+sheetcount);
   System.out.println("active sheet index: " + workbook.getActiveSheetIndex());
  
   for(int i=0; i<sheetcount;i++) {
	   System.out.println(workbook.getSheetName(i));
   }
      //to get specific sheet
      XSSFSheet sheet=workbook.getSheet("LoginDetail");

  }
  
  @Test
  public void getRowOperation() throws IOException {
	// 1.file location
	   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
      //2.cteate instance of requirement workbook
	   XSSFWorkbook x = new  XSSFWorkbook(fis); 
	   //3. get sheet
	   XSSFSheet sheet= x.getSheet("LoginDetail");   
	   //4.get row
	   int rowCount = sheet.getLastRowNum(); //in current row how many rows are present row count= actual count - 1
	   System.out.println("Rocount: "+rowCount);	 
      //get specific row
	   XSSFRow row=sheet.getRow(0);	  
  }
  @Test
  public void getCellOperation() throws IOException {
	   // 1.file location
	   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
       //2.cteate instance of requirement workbook
	   XSSFWorkbook x = new  XSSFWorkbook(fis); 
	   //3. get sheet
	   XSSFSheet sheet= x.getSheet("LoginDetail");   
	   //4.get row
	   XSSFRow row=sheet.getRow(0);
	   System.out.println("cell count is row-0: "+row.getLastCellNum());
	   for(int i=0; i<row.getLastCellNum();i++) {
		   System.out.println(row.getCell(i).getStringCellValue()+ "\t");
	   }
   }
  @Test
  public void getDiffrenceValues() throws IOException {
	// 1.file location
	   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
      //2.cteate instance of requirement workbook
	   XSSFWorkbook x = new  XSSFWorkbook(fis); 
	 //3. get sheet
	   XSSFSheet sheet= x.getSheet("LoginDetail");   
	   //4.get row
	   XSSFRow row=sheet.getRow(2);
	   //5. cell operation
	   System.out.println("cell count is row-0: "+row.getLastCellNum());
	   for(int i=0; i < row.getLastCellNum();i++) {
		 
		   XSSFCell cell = row.getCell(i);
		   switch (cell.getCellType()) {
		   case STRING:
			   System.out.println(cell.getStringCellValue());
			   break;
		   case NUMERIC:
				System.out.println((int) cell.getNumericCellValue());
				break;
		   case BLANK:
				break;
				
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				throw new RuntimeException("there is no suppoer for this cell");
				   
		   }
				
		}
		 
		   
     }
  @Test
  public void getEachRowFirstCellValue() throws IOException {
	   // 1.file location
	   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
       //2.cteate instance of requirement workbook
	   XSSFWorkbook x = new  XSSFWorkbook(fis); 
	   //3. get sheet
	   XSSFSheet sheet= x.getSheet("LoginDetail");   
	   //4.get row count
	   int rowCount = sheet.getLastRowNum();
	   for(int i=0; i <= rowCount;i++) {
		   
		   System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
	  
	   }
  
     }
	     
  @Test
  public void getEachRowAllCellValue() throws IOException {
	   // 1.file location
	   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
       //2.cteate instance of requirement workbook
	   XSSFWorkbook x = new  XSSFWorkbook(fis); 
	   //3. get sheet
	   XSSFSheet sheet= x.getSheet("LoginDetail");   
	   //4.get row count
	   int rowCount = sheet.getLastRowNum();
	   for(int i=0; i < rowCount;i++) {
		   int cellcount=sheet.getRow(i).getLastCellNum();
		   for(int j=0; j < cellcount;j++) {
		   System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()+"/t");
		   }
		   System.out.println();
	   }
  
  }  
  
  @Test
  public void updateResult() throws IOException {
	   // 1.file location
	   FileInputStream fis= new FileInputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");	  
       //2.cteate instance of requirement workbook
	   XSSFWorkbook x = new  XSSFWorkbook(fis); 
	   //3. get sheet
	   XSSFSheet sheet= x.getSheet("LoginDetail");   
	   //4.get row count
	   int rowCount = sheet.getLastRowNum();
	   for(int i=1; i < rowCount;i++) {
		Row row= sheet.getRow(i);
		int cellcount=row.getLastCellNum();
		row.createCell(cellcount).setCellValue("pass");
		
      }
       FileOutputStream fos=new FileOutputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData.xlsx");
       x.write(fos);
       fos.flush();
       fos.close();
   }
  
  @Test
  public void CreateNewExcelFile() throws IOException {
	//1.create new excel file in testdat folder1. 
       FileOutputStream fos=new FileOutputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData_new.xlsx");
     //2.cteate instance of requirement workbook
	   Workbook Workbook = new  XSSFWorkbook(); 
	   Workbook.write(fos);
	   
	   //or
	 //1.create new excel file in testdat folder1. 
  //     FileOutputStream fos1=new FileOutputStream("E:\\Software Testing\\Java\\Workspace\\Selenium_automation\\TestData\\AppData_new1.xlsx");
     
      
        }
}






