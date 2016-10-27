package demo.spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AopLogger {
	
	Logger LOGGER = LoggerFactory.getLogger(AopLogger.class); 
	
	public void logBeforeMethod() {
		LOGGER.info("--- before");
	}
	
	public void logAfterReturningMethod(Object retVal) {
		LOGGER.info("--- return value : " + retVal);
	}
	
	public void logAfterThrowingMethod(Exception ex) {
		LOGGER.error("--- afterThrowing", ex);
	}
	
	public void logAfterMethod() {
		LOGGER.info("--- after");
	}
}
