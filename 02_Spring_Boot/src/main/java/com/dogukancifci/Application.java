package com.dogukancifci;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.TimeZone;

// Auditin aktif etmek için kullanıyoruz.
@EnableJpaAuditing(auditorAwareRef = "auditorAwareBeanMethod")

// Spring Security: Şimdilik dahil etme ancak Spring security için gerekli kütüphaneleri dahil
@SpringBootApplication(exclude = {
		//SecurityAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
// @SpringBootApplication
public class Application {

	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}

	public static void main(String[] args) {

		// devtools active isActive
		// System.setProperty("spring.devtools.restart.enabled","true");

		// PORT Ayarlamak
        /*
        SpringApplication app = new SpringApplication(TurgutUniversitySpringAllInOneApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
         */

		// JOptional pane aktif etmek
		System.setProperty("java.awt.headless", "false");

		// Main
		SpringApplication.run(Application.class, args);
	}//end PSVM

}//end class
