package jdbConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJdbcConfig {

	// Correct DataSource bean method
	@Bean
	public DriverManagerDataSource createDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/kodewala");
		ds.setUsername("root");
		ds.setPassword("Ashish@123");
		return ds;
	}

	// Correct JdbcTemplate bean method
	@Bean
	public JdbcTemplate createJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(createDataSource());
		return template;
	}
}
