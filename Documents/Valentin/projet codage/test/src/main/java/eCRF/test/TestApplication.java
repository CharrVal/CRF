package eCRF.test;

import eCRF.test.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	@Autowired
	SubjectService SubjectService;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
