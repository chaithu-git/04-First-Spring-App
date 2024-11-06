package in.chaithanya;

import java.lang.reflect.Field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Bean.xml");
		BillCollector bc=context.getBean("billCollector",BillCollector.class);
		bc.collectPayment(1400);
	}

		}
