package cg.park.sign_jwt_2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SignJwt2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SignJwt2023Application.class, args);
	}

}
