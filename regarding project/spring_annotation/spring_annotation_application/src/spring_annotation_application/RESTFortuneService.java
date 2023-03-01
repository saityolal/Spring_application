 package spring_annotation_application;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "This is inside of RESTFortuneService";
	}

}
