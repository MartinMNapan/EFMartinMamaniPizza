package pe.idat.edu.EFMartinMamaniPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfMartinMamaniPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfMartinMamaniPizzaApplication.class, args);
	}

}
