package br.com.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import reactor.blockhound.BlockHound;

@SpringBootApplication
@ComponentScan({"br.com.webflux"})
public class SpringWebFluxApplication {

//	static {
//		BlockHound.install();
//	}
	public static void main(String[] args) {
		SpringApplication.run(SpringWebFluxApplication.class, args);
	}

}
