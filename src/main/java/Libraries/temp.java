package Libraries;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
 
public class temp {
 
    static final Logger logger = Logger.getLogger(temp.class);
 
    public static void logging()
    {
        //Configure logger
        BasicConfigurator.configure();
        logger.debug("Hello World!");
    }
    
    public static void main(String[] args) {
    	Map<Integer, String> map = new HashMap<Integer, String>();
    	map.put(1, "Snehal");
    	map.put(1, "mangesh");
    	
    	System.out.println(map);
    	for(Map.Entry m: map.entrySet()) {
    		System.out.println(m.getKey());
    		System.out.println(m.getValue());
    	}
    }
}
