package spring_annotation_application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  // This annotation specifies that is our configuration file.
//@ComponentScan("spring_annotation_application")  //This annotation search for usable components
@PropertySource("classpath:sport.properties")  // With @PropertySource annotation we can use our porpoerty file
public class SportConfig {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		
		return new SadFortuneService();
	}
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
