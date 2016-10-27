package demo.spring_aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo.DummyBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/test/resources/beans.xml" })
public class SpringAopLoggerTest {

	@Autowired
	ApplicationContext context;

	@Test
	public void test() {
		try {
			DummyBean d1 = (DummyBean) context.getBean("dummy1");

			d1.talk();
			
			d1.getTheAnswer();

			d1.throwARunTimeException();
			
		} catch (Exception e) {
			// exceptions should be logged by AopLogger
		}
	}

}
