package yasasi.app.fuelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableKafka
public class FuelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuelApplication.class, args);
	}

}
