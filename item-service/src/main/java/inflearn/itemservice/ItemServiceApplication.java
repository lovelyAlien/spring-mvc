package inflearn.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ItemServiceApplication {


	public static void main(String[] args) {
		System.out.println("loading...");
		SpringApplication.run(ItemServiceApplication.class, args);
		System.out.println("running...");
	}

}
