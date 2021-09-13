package inflearn.factorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {

    public static void main(String[] args) {
        System.out.println("팩토리 패턴 적용 X");
        new Choice().withoutFactory();

        System.out.println();
        System.out.println("팩토리 패턴 적용 O");
        new Choice().withFactory();

    }

}
