package base.clas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JvmReport {
	
	
	
	public static void generateReport(String json) {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ReportJvm");
		Configuration con = new Configuration(file, "Adactin");
		con.addClassifications("build number", "BSD127");
		con.addClassifications("pllatrform", "Windows");
		con.addClassifications("author", "guna");
		con.addClassifications("sprint", "48");
		
		List<String> li = new ArrayList<String>();
		boolean add = li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, con);
		Reportable generateReports = builder.generateReports();

	}

}
