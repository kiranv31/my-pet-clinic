package pro.learning.petclinic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import pro.learning.petclinic.model.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class FakeConfig {

	@Value("${guru.username}")
	private String userName;
	
	@Value("${guru.password}")
	private String password;
	
	@Value("${guru.url}")
	private String url;
	
	@Value("${petclinic.jms.username}")
	private String petClinicUser;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setName(userName);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		System.out.println("Property:"+fakeDataSource.getName());
		System.out.println("Jms:"+petClinicUser);
		return fakeDataSource;
	}
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
