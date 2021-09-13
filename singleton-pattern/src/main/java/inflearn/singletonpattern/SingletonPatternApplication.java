package inflearn.singletonpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonPatternApplication {

    public static void main(String[] args) {
       new FirstPage().setAndPrintSettings();
       System.out.println();
       new SecondPage().printSettings();


    }

}
