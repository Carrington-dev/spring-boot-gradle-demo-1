package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.courses.Course;
import com.example.demo.courses.CourseService;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	// @Test
	// void shouldCreateANewCashCard() {
	// Course newCashCard = new Course(5, "Python Programming for beginners", "Python for dummies");
	// ResponseEntity<Void> createResponse = CourseService.postForEntity(newCashCard);
	// 	assertThat(createResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
	// }

}
