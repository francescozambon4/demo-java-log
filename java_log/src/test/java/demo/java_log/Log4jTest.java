package demo.java_log;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
	
	final static Logger LOGGER = Logger.getLogger(Log4jTest.class);
	
	@Test
	public void test() {
		
		LOGGER.debug("--- log4j debug msg");
		LOGGER.info("--- log4j info msg");
		LOGGER.error("--- log4j error msg");
		
	}

}
