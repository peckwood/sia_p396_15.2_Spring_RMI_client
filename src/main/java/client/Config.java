package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class Config {
	
	@Bean
	public RmiProxyFactoryBean calculator(){
		RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
		rmiProxy.setServiceUrl("rmi://localhost/calculator_service");
		rmiProxy.setServiceInterface(Calculator.class);
		return rmiProxy;
	}
}
