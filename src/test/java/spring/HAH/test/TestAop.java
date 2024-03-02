package spring.HAH.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import spring.HAH.demo.BusinessInterface;

@SpringJUnitConfig(locations = "classpath:BeanCreation.xml")
public class TestAop {
	
	@Autowired
	private BusinessInterface businessInterface;

	@Test
	public void demoTest() {
		assertNotNull(businessInterface);
		businessInterface.doWork();
	}
}
