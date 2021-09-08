package inflearn.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafBasicApplication {

	public static void main(String[] args) {
		System.out.println("loading...");
		SpringApplication.run(ThymeleafBasicApplication.class, args);
		System.out.println("running...");
	}

}
