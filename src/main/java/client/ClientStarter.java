package client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Calculator calculator = context.getBean(Calculator.class);
		System.out.println(calculator.sum(1, 2));
		context.close();
	}

}
