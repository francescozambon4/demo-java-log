package demo.java_log;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jLog4jTest {
	
	final static Logger LOGGER = LoggerFactory.getLogger(Slf4jLog4jTest.class);
	
	@Test
	public void test() {
		
		LOGGER.debug("Slf4jLog4jTest debug msg");
		LOGGER.info("Slf4jLog4jTest info msg");
		LOGGER.error("Slf4jLog4jTest error msg");
		
	}

}
