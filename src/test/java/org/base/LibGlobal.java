package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal   { 
	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	} 
	public static void loadUrl(String url) {
		driver.get(url);

	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static  void applyWaitTimeForAllLocs() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void removeAlCookies() {
	driver.manage().deleteAllCookies();

	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void toClear(WebElement element) {
		element.clear();
	
	}
	public static void takeSnap(String filename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\ELCOT\\Desktop\\sheelawork\\cucumbersheela\\ScreenShot\\"+filename+".png");
		FileUtils.copyFile(src, dest);
	}	
	public static  void fill(WebElement element,String text) {
		element.sendKeys(text);

	}
	public static  void btnClick(WebElement element) {
	element.click();

	}
	public static Map<String, String> excelRead(String testcase,String ColumnName) throws IOException {
		Map<String,String>map=new LinkedHashMap<String,String>();
		File file=new File("login.xlxs.file");
		FileInputStream fi =new FileInputStream(file);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("sheetname");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String testcaseNo = cell.getStringCellValue();
			String testcaseId = cell.getStringCellValue();
			
			if (testcaseNo.equals(testcaseId)) {
				Row headerRow = sheet.getRow(0);
				Row requiredRow = sheet.getRow(i);
				for (int j = 0; j <headerRow.getPhysicalNumberOfCells(); j++) {
					
					Cell heading = headerRow.getCell(j);
					Cell data = requiredRow.getCell(j);
					String txtHeading = heading.getStringCellValue();
					
					String txtData = data.getStringCellValue();
					map.put(txtHeading,txtData);
				}
				
				
				
			}
			
		}

return map;
	}
	}
