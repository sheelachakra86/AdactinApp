package org.newadactin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JvmReport");
		Configuration con=new Configuration(f, "Adactin Applilication");
		con.addClassifications("Platform name", "Window10");
		con.addClassifications("Browser name", "Chrome");
		con.addClassifications("Browser version", "89.0");
		con.addClassifications("Sprint", "23");
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		ReportBuilder r = new ReportBuilder(li,con);
		r.generateReports();
		
	
	}

}
