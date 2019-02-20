package Util;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {

    private static boolean root = false;
    public static void Logger() {
        //if(root)
            //return Logger.getLogger(clas);
       // PropertyConfigurator.configure("D:\\DemoMavenProject\\Cucumber_Selenium\\src\\main\\resources\\logs\\log4j.properties");
        //root = true;
        //return Logger.getLogger(clas);
    	BasicConfigurator.configure();
    }
}
