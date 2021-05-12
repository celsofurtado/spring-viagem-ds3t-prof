package br.senai.sp.jandira.viagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ViagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViagemApplication.class, args);
	}

}

//@SpringBootApplication
//public class ViagemApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ViagemApplication.class, args);
//	}
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(ViagemApplication.class);
//	}
//
//}
