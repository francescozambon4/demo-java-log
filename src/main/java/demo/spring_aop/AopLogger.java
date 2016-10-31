package demo.spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AopLogger {

	Logger LOGGER = LoggerFactory.getLogger(AopLogger.class);

	public void logBeforeMethod(JoinPoint joinPoint) {
		LOGGER.info("--- before, hashcode : " + joinPoint.getTarget().hashCode());
	}

	public void logAfterReturningMethod(Object retVal) {
		LOGGER.info("--- return value : " + (null != retVal ? retVal : "NULL!!!"));
	}

	public void logAfterThrowingMethod(Exception ex) {
		LOGGER.error("--- afterThrowing", ex);
	}

	public void logAfterMethod(JoinPoint joinPoint) {
		LOGGER.info("--- after, hashcode : " + joinPoint.getTarget().hashCode());
	}

	public Object traceExcetionTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		Object retVal = pjp.proceed();
		long stop = System.currentTimeMillis();
		LOGGER.info("--- execution time : " + (stop - start) + "(ms)");
		return retVal;
	}
}
