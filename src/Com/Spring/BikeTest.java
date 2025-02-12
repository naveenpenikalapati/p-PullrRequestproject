package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeTest {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ne.xml");
		System.out.println("config loaded");
		
		Tvs tv=(Tvs) context.getBean("tvsbike");
		tv.cost();
		tv.Capacity();
		
	}

}
