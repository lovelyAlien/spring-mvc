package spring.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan// 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {


	public static void main(String[] args) {
		System.out.println("loading...");
		SpringApplication.run(ServletApplication.class, args);
		System.out.println("running...");
	}

}
