package guru.springframework.sfgdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.sfgdi.examplefakebeans.FakeDataSource;

/*
 * @PropertySource e uma anotacao repeatable, ela declara uma containing annotatio type chamada PropertySources, cujo possui um elemento array de PropertySource
 */
@Configuration
@PropertySource({ "classpath:datasouce.properties" })
@PropertySource({ "classpath:jms.properties" })
public class PropertyConfig {

	@Autowired
	private Environment env;

	@Value("${nicholas.name}")
	private String name;

	@Value("${nicholas.age}")
	private Integer age;

	@Value("${nicholas.country}")
	private String country;

	@Value("${jms.password}")
	private String jmsPassword;

	@Value("${jms.user}")
	private String jmsUser;

	@Value("${jms.urljdbc}")
	private String urlJdbc;

	@Bean
	public FakeDataSource fake() {
		FakeDataSource fake = new FakeDataSource(name, age, country, jmsPassword, jmsUser, urlJdbc);
		System.out.println("value variavel amb: " + env.getProperty("JAVA_HOME"));
		return fake;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		/*
		 * Isso nos permite pegar os values das keys do propeties file
		 */
		return new PropertySourcesPlaceholderConfigurer();
	}

}
