package pract.chuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"pract.model","pract.controller","pract.service","pract.repository"})
@EntityScan({"pract.model","pract.controller","pract.service","pract.repository"})
public class KaiyuApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaiyuApplication.class, args);
	}

}
