package guru.springframework.sfgdi.examplefakebeans;

public class FakeDataSource {

	private String name;

	private Integer age;

	private String country;

	private String jmsPass;

	private String jmsUser;

	private String jmsJdbcUrl;

	public FakeDataSource(String name, Integer age, String country, String jmsPass, String jmsUser, String jmsJdbcUrl) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.jmsPass = jmsPass;
		this.jmsUser = jmsUser;
		this.jmsJdbcUrl = jmsJdbcUrl;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "FakeDataSource [name=" + name + ", age=" + age + ", country=" + country + ", jmsPass=" + jmsPass
				+ ", jmsUser=" + jmsUser + ", jmsJdbcUrl=" + jmsJdbcUrl + "]";
	}

}
