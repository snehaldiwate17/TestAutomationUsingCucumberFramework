package Util;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class LogUtil {
	
	public static final Logger log = Logger.getLogger(LogUtil.class);
	
	 
    public static void logging()
    {
        //Configure logger
        BasicConfigurator.configure();
        //PropertyConfigurator.configure("D:\\DemoMavenProject\\Cucumber_Selenium\\src\\main\\resources\\logs\\log4j.properties");
        log.debug("Hello World!");
    }
}
