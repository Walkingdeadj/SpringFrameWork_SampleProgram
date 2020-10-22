package celluar.controller;

import org.springframework.context.annotation.Bean;

import celluar.beans.CustomerContact;
import celluar.beans.MailAddress;

public class BeanConfiguration {
	@Bean
	public CustomerContact customerContact() {
		CustomerContact bean = new CustomerContact( );
		return bean;
	}
	
	@Bean
	public MailAddress address() {
		MailAddress bean = new MailAddress();
		return bean;
	}
}
