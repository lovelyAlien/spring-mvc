package inflearn.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {

		System.out.println("loading...");
		SpringApplication.run(SpringmvcApplication.class, args);
		System.out.println("running...");
	}

}
