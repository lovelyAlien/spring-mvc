package inflearn.customannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAnnotationApplication {

	public static void main(String[] args) {

		ContainerService containerService = new ContainerService();

		ArticleController articleController = containerService.getObject(ArticleController.class);

		articleController.foo();
	}

}
