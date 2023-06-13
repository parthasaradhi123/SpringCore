package partha.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
	@Bean
	public EncPassword getInstance()
	{
		EncPassword pw = new EncPassword();
		return pw;
	}
	
}
